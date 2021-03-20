package com.matrix.exer;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.WeakHashMap;

/**
 * @Author: yihaosun
 * @Date: 2021/3/20 15:19
 */
public class TestStreamAPI {

    @Test
    public void test1() {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .map((x)->x * x)
                .forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<Employee> emps = Arrays.asList(
                new Employee(102, "李四", 59, 6666.66, Employee.Status.BUSY),
                new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
                new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
                new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
                new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
        );

        Optional<Integer> count = emps.stream().map((e) -> 1).reduce(Integer::sum);
        System.out.println(count.get());

    }

    @Test
    public void test3() {

    }
}
