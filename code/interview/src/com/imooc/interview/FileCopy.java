package com.imooc.interview;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        //1. 利用JAVA ＩＯ
        File source = new File("e:/tomcat8.zip");
        File target = new File("e:/target/tomcat8.zip");
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(target);
            byte[] buf = new byte[1024];
            int byteRead;
            while((byteRead = input.read(buf)) != -1){
                output.write(buf , 0 , byteRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //2. FileChannel实现文件复制
        //3. Commons IO组件实现文件复制
        //FileUtils.copyFile(Source , Target);
        //4. Java 7 提供了Files类
        //Files.copy(Source,Target)
    }
}
