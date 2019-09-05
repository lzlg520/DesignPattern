package com.lzlg.interpreter;

import java.util.Map;

/**
 * 减法表达式
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        return super.getLeft().interpret(var) - super.getRight().interpret(var);
    }
}
