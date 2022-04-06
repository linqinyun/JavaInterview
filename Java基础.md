# Java基础

## 基础语法

### JDK、JRE、JVM有什么区别

- JDK:Java Development Kit 针对Java程序员的产品
- JRE:Java Runtime Environment 是运行Java的环境集合
- JVM:Java虚拟机用于运行Java字节码文件（.class文件），跨平台的核心
  - 跨平台特性，JVM层面开发，又JVM转义其他平台api完成对接工作

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

- 封装
  - 封装的好处：
    1. 实现专业的分工
    2. 减少代码的耦合
    3. 可以自由修改类的内部结构
    4. 接口是封装常用使用
- 继承
  - Java中类是不支持多继承的，接口可以，一个接口可以继承多个其它接口
- 多态
  - 多态是三大特性中最重要的操作
  - 多态是同一个行为具有多个不同表现形式或形态的能力
  - 多态是同于一个接口，使用不用的实例而执行不同操作
- **补充：接口与抽象类有哪些异同**

| 相同点 | 不同点 |
| :---: | :---: |
| 都是上层的抽象 | 抽象类可包含方法的实现 <br> 接口则只能包含方法的声明 |
| 不能被实例化 | 继承类只能继承一个抽象类 <br> 实现类可以实现多个接口 |
| 都可以包含抽象方法 | 抽象级别 接口>抽象类>实现类 |
| | 作用不同：<br> 接口用于约束程序行为 <br> 继承则用于代码复用 |

>注意：JDK8以上版本，接口可以有default方法，包含方法实现

### 静态与实例变量的区别

- 语法区别：静态变量前要加static关键字，实例则不用
- 隶属区别：实例变量属于某个对象的属性，而静态属于类
- 运行区别：静态变量在JVM加载类被创建（运行时无法被垃圾回收释放，存储区在JVM方法区，存储空间小），实例变量在实例化对象时创建（不使用时释放，存储在对象堆的内存中，存储空间多）

### 类的执行顺序

1. 静态优先
2. 父类优先
3. 非静态块优先与构造函数，**构造函数也属于非静态块**

### Java的异常体系

- Error -> Throwable
- RuntimeException -> Exception -> Throwable
- Exception：所有异常统称，需强制进行处理
- RuntimeException：运行时异常，编码阶段不强制处理，不显示try catch处理

#### Error和Exception的区别与联系

| Exception | Error |
| :---: | :---: |
| 可以是可被控制或不可控制 | 总是不可控制 |
| 表示一个由程序员导致的错误 | 经常用于表示系统错误或底层资源错误 |
| 应该在应用程序级被处理 | 如果可能的话，应该在系统级被捕获 |

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
