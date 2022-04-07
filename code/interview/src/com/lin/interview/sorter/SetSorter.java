package com.lin.interview.sorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SetSorter {
    public static void main(String[] args) {
        // 自定义排序
        TreeSet<Employee> emps = new TreeSet<Employee>(
//                new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if((o1.getSalary()-o2.getSalary())<0 && (o1.getSalary()-o2.getSalary())>-1){
//                    return -1;
//                }
//                if((o1.getSalary()-o2.getSalary())>0 && (o1.getSalary()-o2.getSalary())<1){
//                    return 1;
//                }
//                // 当前为升序
//                return (int)(o1.getSalary()-o2.getSalary());
//            }
//        }
        );
        emps.add(new Employee("张三",33,10009f));
        emps.add(new Employee("李四",40,7800f));
        emps.add(new Employee("王五",50,6533f));
        System.out.println(emps);
    }
}
