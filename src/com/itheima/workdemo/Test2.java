package com.itheima.workdemo;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\b.txt");
        System.out.println(file.exists() ? false : file.createNewFile());
    }
}
