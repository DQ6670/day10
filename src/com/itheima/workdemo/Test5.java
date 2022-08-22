package com.itheima.workdemo;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("d:\\a.txt");
        File file1 = new File("d:\\aaa");
        System.out.println(file.delete());
        System.out.println(file1.delete());
    }
}
