package com.lzlg.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * 解释类
 */
public class Parser {
    /**
     * 字符串表达式
     */
    private String expStr;
    /**
     * 最终表达式
     */
    private Expression expression;
    /**
     * 字符存储Map集合
     */
    private Map<String, Integer> varMap = new HashMap<>();

    public Parser() {
        setField();
        getExpression();
    }

    /**
     * 通过用户输入设置字段的值
     */
    private void setField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入表达式：");
        expStr = scanner.next();
        char[] chars = expStr.toCharArray();
        for (char c : chars) {
            if (c != '+' && c != '-') {
                if (varMap.get(String.valueOf(c)) == null) {
                    System.out.println("请输入" + c + "的值：");
                    Integer input = scanner.nextInt();
                    varMap.put(String.valueOf(c), input);
                }
            }
        }
    }

    /**
     * 获取最终表达式
     */
    private void getExpression() {
        Stack<Expression> stack = new Stack<>();
        Expression left;
        Expression right;
        char[] chars = expStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    /**
     * 获得运算结果
     *
     * @return
     */
    public int run() {
        if (varMap == null) {
            throw new NullPointerException("没有值计算");
        }
        return expression.interpret(this.varMap);
    }
}
