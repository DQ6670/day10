package com.itheima.workdemo;

import java.io.File;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        File file = new File(sc.nextLine());
        System.out.println(file.getName());
        String str = "";
        printFileName(file,str);
    }
    private static void printFileName(File file,String str) {
        str += "   ";
        File[] files = file.listFiles();
        for (File f : files) {
           if (f.isFile()){
               System.out.println(str + f.getName());
           }
        }
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(str + f.getName());
                printFileName(f,str);
            }
        }
    }
}

