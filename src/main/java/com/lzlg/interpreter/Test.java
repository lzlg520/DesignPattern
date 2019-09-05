package com.lzlg.interpreter;

public class Test {
    public static void main(String[] args) {
        Parser parser = new Parser();
        int run = parser.run();
        System.out.println("result is " + run);
    }
}
