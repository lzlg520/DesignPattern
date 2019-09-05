package com.lzlg.interpreter;

import java.util.Map;

/**
 * 加法表达式
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        return super.getLeft().interpret(var) + super.getRight().interpret(var);
    }
}
