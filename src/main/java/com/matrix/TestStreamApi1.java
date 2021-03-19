package com.matrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: yihaosun
 * @Date: 2021/3/19 08:15
 */
public class TestStreamApi1 {
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Employee[] emps = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(emps);

        Stream<String> stream3 = Stream.of("aa", "bb", "cc");

        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
//        stream4.forEach(System.out::println);
//        stream4.limit(10).forEach(System.out::println);

        Stream<Double> stream5 = Stream.generate(() -> Math.random());
        stream5.limit(6).forEach(System.out::println);
    }
}
