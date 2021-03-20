package com.matrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 终止操作
 * @Author: yihaosun
 * @Date: 2021/3/20 14:30
 */

public class TestStreamApi3 {

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 79, 6666.66, Employee.Status.BUSY),
            new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
    );

    @Test
    public void test1() {
        boolean b1 = emps.stream().allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);
        emps.stream().anyMatch((e)->e.getStatus().equals(Employee.Status.BUSY));
        emps.stream().noneMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        emps.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        Optional<Double> optionalDouble = emps.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(optionalDouble.get());

    }

    @Test
    public void test4() {
        Map<Employee.Status, List<Employee>> map = emps.stream().collect(Collectors.groupingBy(Employee::getStatus));
        System.out.println(map);
    }

}
