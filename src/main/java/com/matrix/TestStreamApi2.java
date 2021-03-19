package com.matrix;

import com.sun.org.apache.xerces.internal.util.Status;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: yihaosun
 * @Date: 2021/3/19 08:30
 */
public class TestStreamApi2 {

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66),
            new Employee(101, "张三", 18, 9999.99),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );

    // 内部迭代
    @Test
    public void test1() {
        // 中间操作 不执行任何操作 延迟操作 惰性求值
        Stream<Employee> stream = emps.stream().filter((e) -> e.getAge() > 35);
        // 终止操作
        stream.forEach(System.out::println);
    }

    //外部迭代
    @Test
    public void test2() {
        Iterator<Employee> it = emps.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void test3() {
        emps.stream()
                .filter((e) -> e.getSalary() > 5000)
                .skip(2)
                .distinct()
                .forEach(System.out::println);
    }
}
