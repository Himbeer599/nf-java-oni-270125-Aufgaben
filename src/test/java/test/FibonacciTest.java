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
}
