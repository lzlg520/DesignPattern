package com.lzlg.interpreter;

import java.util.Map;

/**
 * 符号表达式
 */
public class SymbolExpression extends Expression {
    // 左变量表达式
    private Expression left;
    // 右变量表达式
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        throw new UnsupportedOperationException("不支持的操作");
    }
}
