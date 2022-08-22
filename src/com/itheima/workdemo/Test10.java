package com.itheima.workdemo;

import java.io.File;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        while (true) {
            String filePath = sc.nextLine();
            File file = new File(filePath);
            if (file.isFile()){
                long fileLength = file.length();
                System.out.println(fileLength);
                break;
            }else {
                System.out.println("您输入的不是文件的路径");
            }
        }
    }
}
