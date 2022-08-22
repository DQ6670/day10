package com.itheima.workdemo;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\itheima\\Code\\JavaSE2\\day11\\a.txt");
        file.createNewFile();
        File file1 = new File("day11\\b.txt");
        file1.createNewFile();
    }
}
