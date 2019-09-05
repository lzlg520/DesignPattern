package com.lzlg.interpreter;

import java.util.Map;

/**
 * 变量表达式
 */
public class VarExpression extends Expression {

    private String key;

    private int value;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        return var.get(key);
    }
}
