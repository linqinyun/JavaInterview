package com.imooc.interview;

public class ConstantPool {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc"+"def";
        String s4 = "abcdef";
        String s5 = s2+"def";
        String s6 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println(s1==s6);


    }
}
