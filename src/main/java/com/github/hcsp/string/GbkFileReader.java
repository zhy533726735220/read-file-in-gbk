package com.github.hcsp.string;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GbkFileReader {
    public static void main(String[] args) {
        File projectDir = new File(System.getProperty("basedir", System.getProperty("user.dir")));
        System.out.println(new GbkFileReader().readFileWithGBK(new File(projectDir, "gbk.txt")));
    }

    public String readFileWithGBK(File file) {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int length = inputStream.read(bytes);
            return new String(bytes, 0, length, "GBK");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
