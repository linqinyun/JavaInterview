# Java基础

## 基础语法

### JDK、JRE、JVM有什么区别

- JDK:Java Development Kit 针对Java程序员的产品
- JRE:Java Runtime Environment 是运行Java的环境集合
- JVM:Java虚拟机用于运行Java字节码文件（.class文件），跨平台的核心
  - 跨平台特性，JVM层面开发，又JVM转义其他平台api完成对于工作

### 常用数字类型的区别

| 名称 | 取值范围 | 存储空间 |
| :---: | :---: | :---: |
| 字节(Byte) | $-2^7$ ~ $2^7-1$ <br> -128 ~ 127  | 1个字节 |
| 短整数(short) | $-2^15$ ~ $2^15-1$ <br> -32768 ~ 32767 | 2个字节 |
| 整数(int) | $-2^31$ ~ $2^31-1$ <br> -2147483648 ~ 2147483647 | 四个字节 |
| 长整数(long) | $-2^63$ ~  $2^63-1$ | 8个字节 |
| 单精度(float) | $2^-149$ ~ $2^128-1$ | 4个字节 |
| 双精度(double) | $2^-1049$ ~ $2^1024-1$ | 8个字节 |

### Float在JVM的表达方式及使用陷阱

```java
float d1 = 423432423f;
float d2 = d1 + 1;
if(d1 == d2){
    System.out.println("d1==d2");
}else{
    System.out.println("d1!=d2");
}
```

- 打印结果为：d1 == d2
- float类型在内存中的存储形式为**科学计数法**，表达为：4.2343242E7
- d2用科学计数法表示同样为4.2343242E7，因此d1 == d2
- **注意Java类型转换**
- **大数计算使用 `BigDecimal`**

### 随机数的使用

```java
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

```

### 找出1-1000内的质数

```java
package com.lin.interview;

/**
 * 1-1000内的质数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}

```

## 面向对象

### 面向对象三大特性是什么

### 静态与实例变量的区别

### 类的执行顺序

### Java的异常体系

## 字符串

### String与字符串常量

### String、StringBuilder与StringBuffer的区别

## 集合

### List与Set的区别

### List排序的编码实现

### TreeSet排序的编码实现

### hashCode与equals的联系与区别

## 输入输出流

### Java IO中有几种类型的流

### 利用IO实现文件复制

## 多线程

### 实现多线程的三种方式

### 请阐述线程的状态及触发机制

### 实现线程同步的三种方式

### 死锁的产生

## 垃圾回收与JVM内存

### JVM的内存组成

### GC垃圾回收及算法介绍

### Java的内存泄露场景

### 请实现对象浅复制与深复制
