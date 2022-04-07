package com.lin.interview.sorter;

//自然排序 TreeSet
public class Employee implements Comparable<Employee>{
    private String name;
    private Integer age;
    private Float salary;

    public Employee() {
    }

    public Employee(String name, Integer age, Float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge().compareTo(o.getAge()); //compareTo 1 前面大于后面 -1 后面大于前面
    }
}
