    package com.itheima.demo1;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

    public class Test1 {
    public static void main(String[] args) {
        File file = new File("G:\\aaa");
        HashMap<String,Integer> hm = new HashMap<>();
        getEndFile(file,hm);
        System.out.println(hm);
    }

    private static void getEndFile(File file, HashMap<String, Integer> hm) {
        File[] files  = file.listFiles();
        System.out.println(Arrays.toString(files));
        for (File file1 : files) {
            if (file1.isFile()){
                String name = file1.getName();
                String[] str = name.split("\\.");
                if (str.length >= 2 ){
                    String endfilename = str[str.length -1 ].toLowerCase(Locale.ROOT);
                    if (hm.containsKey(endfilename)){
                        Integer count = hm.get(endfilename);
                        count++;
                        hm.put(endfilename,count);
                    }else {
                        hm.put(endfilename,1);
                    }
                }
            }else {
                getEndFile(file1,hm);
            }
        }

    }
}
