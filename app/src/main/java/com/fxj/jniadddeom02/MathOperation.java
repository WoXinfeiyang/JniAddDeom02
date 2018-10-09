package com.fxj.jniadddeom02;

public class MathOperation {
    static {
        System.loadLibrary("math_operation");
    }

    public static native int add(int a,int b);
}
