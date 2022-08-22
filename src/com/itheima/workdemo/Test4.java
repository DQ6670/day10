package com.itheima.workdemo;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File( "d:\\ccc\\bbb\\aaa");
        System.out.println(file.mkdirs());
    }
}
