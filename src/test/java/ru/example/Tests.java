package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void test1() {
        assertEquals("1","2", "fail test");
    }
    @Test
    public void test2() {
        assertEquals("1","2", "fail test");
    }
    @Test
    public void test3() {
        assertEquals("1","2", "fail test");
    }
    @Test
    public void test4() {
        assertEquals("1","1", "pass test");
    }
    @Test
    public void test5() {
        assertEquals("1","1", "pass test");
    }
    @Test
    public void test6() {
        assertEquals("1","1", "pass test");
    }
    @Test
    public void test7() {
        assertEquals("1","1", "pass test");
    }
    @Test
    public void test8() {
        assertEquals("1","1", "pass test");
    }
    @Test
    public void test9() {
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        assertEquals("1","1", "pass test");
    }



}