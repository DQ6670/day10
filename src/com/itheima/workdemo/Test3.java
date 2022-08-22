package com.itheima.workdemo;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File( "d:\\bbb");
        System.out.println(file.mkdir());
    }
}
