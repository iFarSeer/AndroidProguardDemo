package com.huajing.cctalk.proguard.demo;

/**
 * class description here
 *
 * @author zhaosc
 * @version 1.0.0
 * @since 27/10/2017.
 */

public class CCProguardTest1 {

    String outterString;

    InnerClass innerClass;

    public void method1() {
        outterString = "outterString";
        innerClass = new InnerClass();
        innerClass.innerString = "innerString";
    }

    public void metthod2(String text) {

    }

    public void notUsedMethod() {

    }

    public static class InnerClass {
        String innerString;
    }
}
