package com.lin.interview;

import java.util.Random;

/**
 * 30-100的随机整数
 */
public class RandomSample {
    //方法1
    public Integer randomInt1(){
        int min = 30;
        int max = 101;
        int result =  new Random().nextInt(max - min) + min;
        return  result;
    }
    //方法2
    public Integer randomInt2(){
        int min = 30;
        int max = 101;
        int result = (int)(Math.random()*(max-min))+min;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RandomSample().randomInt1());
        System.out.println(new RandomSample().randomInt2());
    }
}
