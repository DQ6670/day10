package com.itheima.demo1;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("day11\\a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
