package com.lzlg.interpreter;

import java.util.Map;

/**
 * 解释器模式：表达式基类
 */
public abstract class Expression {
    public abstract int interpret(Map<String, Integer> var);
}
