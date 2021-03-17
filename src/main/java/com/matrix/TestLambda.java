package com.matrix;

import org.junit.Test;

import java.util.Collections;
import java.util.function.Consumer;

/**
 * @Author: yihaosun
 * @Date: 2021/3/16 10:06 下午
 */
public class TestLambda {
    @Test
    public void test1() {
        Consumer<String> con = System.out::println;
        con.accept("matrix");
    }
    
}
