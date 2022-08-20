package com.itheima.demo1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("day11\\aaa");
        method1(file);
    }

    private static void method1( File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                file1.delete();
            }else {
                method1(file1);
            }
        }
        file.delete();
    }
}
