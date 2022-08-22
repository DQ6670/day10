package com.itheima.workdemo;

import java.io.File;

public class Test9 {
    public static void main(String[] args) {
        File file = new File("d:\\aaa");
        printFileSuffixName(file);
    }

    private static void printFileSuffixName(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String name = f.getName();
                String[] str = name.split("\\.");
                if ((str[str.length - 1].contains("java"))){
                    System.out.println(name);
                }
            }else {
                printFileSuffixName(f);
            }
        }
    }
}
