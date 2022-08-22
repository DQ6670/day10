package com.itheima.workdemo;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("d:\\b.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
    }
}
