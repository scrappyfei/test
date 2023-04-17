package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Hello, world!");
    }

    @Test
    public void test01() {
        log.info("Hello, world!");
    }

    @Test
    public void test02() {
        System.out.println("Hello, world!");

    }

}
