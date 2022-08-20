package com.itheima.file;
     /*
    获取
        掌握
            String getName():获取文件（带后缀名）或者文件夹名称
            String getPath()：获取文件或者文件夹路径名，传递的是相对路径就获取相对路径，传递绝对获取绝对
            long length()：获取文件的大小（字节个数），不能获取文件夹大小的
            File[] listFiles()

        了解
            File getAbsoluteFile()：获取绝对路径
            String getAbsolutePath()：获取绝对路径
            String toString()：底层调用是getPath方法，和getPath方法效果一直
            long lastModified()：获取最后的修改时间的毫秒值
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class file {
    public static void main(String[] args) {
        File file = new File("day11\\src\\com\\itheima\\file\\file.java");
        File file1 = new File("day11\\a");
        //String getName():获取文件（带后缀名）或者文件夹名称
        System.out.println(file1.getName());
        //String getPath()：获取文件或者文件夹路径名，传递的是相对路径就获取相对路径，传递绝对获取绝对
        System.out.println(file1.getPath());
        //long length()：获取文件的大小（字节个数），不能获取文件夹大小的
        System.out.println(file.length());
        //File getAbsoluteFile()：获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //String getAbsolutePath()：获取绝对路径
        System.out.println(file.getAbsolutePath());
        //String toString()：底层调用是getPath方法，和getPath方法效果一致
        System.out.println(file);
        //long lastModified()：获取最后的修改时间的毫秒值
        System.out.println(file.lastModified());
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));


    }
}


