package com.lin.interview;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        //1. 利用Java IO
        File source = new File("D:\\开发资源\\spring-framework-4.2.4.RELEASE-dist.zip");
        File target = new File("D:\\开发资源\\target\\spring-framework-4.2.4.RELEASE-dist.zip");

        InputStream ipt = null;
        OutputStream opt = null;

        try {
            ipt = new FileInputStream(source);
            opt = new FileOutputStream(target);
            byte[] buf = new byte[1024];
            int byteRead;

            while ((byteRead = ipt.read(buf)) != -1) {
                opt.write(buf, 0, byteRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ipt.close();
                opt.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //2. FileChannel 实现文件复制
        //3. Commons IO组件实现文件复制
        //FileUtils.copyFile(Source,Target);
    }
}
