package com.itheima.file;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File file = new File("a.txt");
//        System.out.println(file.mkdir());
        System.out.println(file.getAbsolutePath());
        File file2 = new File("itheima/xian");
        System.out.println(file2.mkdirs());
        File file3 = new File("itcast");
        System.out.println(file3.getAbsolutePath());

        System.out.println(file3.delete());
    }
}
