package com.itheima.workdemo;

import java.io.File;
public class Test7 {
    public static void main(String[] args) {
        File file = new File("d:\\ccc");
        if (file.isFile()){
            System.out.println( file.getName() + "是一个文件");
        }else {
            System.out.println( file.getName() + "不是一个文件");
        }
        if (file.isDirectory()){
            System.out.println( file.getName() + "是一个文件夹");
        }else {
            System.out.println( file.getName() + "不是一个文件夹");
        }
    }
}

