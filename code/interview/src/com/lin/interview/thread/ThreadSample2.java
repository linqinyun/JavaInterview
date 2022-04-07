package com.lin.interview.thread;

import java.util.Random;

public class ThreadSample2 {
    public static void main(String[] args) {
        Thread r1 = new Thread(new Runner2());
        r1.setName("张三");
        Thread r2 = new Thread(new Runner2());
        r2.setName("李四");
        Thread r3 = new Thread(new Runner2());
        r3.setName("王五");
        r1.start();
        r2.start();
        r3.start();
    }
}

/**
 * 第二种
 * 第二种与第一种 底层一致
 * 开发中更推荐 第二种，接口实现 ，更加友好
 */
class Runner2 implements Runnable {

    @Override
    public void run() {
        Integer speed = new Random().nextInt(10) + 1;
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "已前进" + (i * speed) + "米");
        }
    }
}
