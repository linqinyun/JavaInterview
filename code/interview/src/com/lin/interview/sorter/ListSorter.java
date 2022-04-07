package com.lin.interview.sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("张三",33,10009f));
        emps.add(new Employee("李四",40,7800f));
        emps.add(new Employee("王五",50,6533f));

        Collections.sort(emps, new Comparator<Employee>() { //排序
            @Override
            public int compare(Employee o1, Employee o2) { //内部匿名方法
                if((o1.getSalary()-o2.getSalary())<0 && (o1.getSalary()-o2.getSalary())>-1){
                    return -1;
                }
                if((o1.getSalary()-o2.getSalary())>0 && (o1.getSalary()-o2.getSalary())<1){
                    return 1;
                }
                // 当前为升序
                return (int)(o1.getSalary()-o2.getSalary());
                // 当前为降序
                //return (int)(o2.getSalary()-o1.getSalary());
            }
        });
        System.out.println(emps);


    }
}
