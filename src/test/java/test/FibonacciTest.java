package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void test(){
        int i = 1;
        int expected =0;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void test2(){
        int i = 2;
        int expected =1;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test3(){
        int i = 3;
        int expected =1;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test4(){
        int i = 4;
        int expected =2;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test5(){
        int i = 5;
        int expected =3;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test6(){
        int i = 6;
        int expected =5;
        int actual = Fibonacci.calculate(i);
        Assertions.assertEquals(expected,actual);
    }
}
