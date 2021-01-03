package ru.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @BeforeEach
    public void helloWorld() {
        System.out.println("-----------------------------");
        System.out.println("------   TEST RUN -----------");
        System.out.println("-----------------------------");
    }

    @AfterEach
    public void godbyWorld() {
        System.out.println("-----------------------------");
        System.out.println("------   TEST END -----------");
        System.out.println("-----------------------------");
    }

    String two = "2";
    String one = "1";

    public String listenMavenParam() {
        String pass = System.getProperty("pass");
        if (pass.equals("yes")) {
            return one;
        }
        return two;
    }

    @Test
    public void test1() {
        assertEquals("1", listenMavenParam());
    }

    @Test
    public void test2() {
        assertEquals("1", listenMavenParam());
    }

    @Test
    public void test3() {
        assertEquals("1", listenMavenParam());
    }

    @Test
    public void test4() {
        assertEquals("1", "1", "pass test");
    }

    @Test
    public void test5() {
        assertEquals("1", "1", "pass test");
    }

    @Test
    public void test6() {
        assertEquals("1", "1", "pass test");
    }

    @Test
    public void test7() {
        assertEquals("1", "1", "pass test");
    }

    @Test
    public void test8() {
        assertEquals("1", "1", "pass test");
    }

    @Test
    public void test9() {
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        assertEquals("1", "1", "pass test");
    }


}
