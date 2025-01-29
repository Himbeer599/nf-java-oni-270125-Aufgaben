package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodForTest_Test {

    @Test
    void add() {
        int a = 1;
        int b = 2;
        int expectedValue = 3;
        int actual = MethodForTest.add(a, b);
        assertEquals(expectedValue, actual);
    }

    @Test
    void isEven() {
        int a = 5;
        boolean expected = true;
        boolean actual = MethodForTest.isEven(a);
        assertEquals(expected, actual);
    }

    @Test
    void product() {
        int a = 5;
        int b = 3;
        int expected = 15;
        int actual = MethodForTest.product(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void StringtoUppercase() {
        String str = "Hello";
        String expected = "HELLO";
        String actual = MethodForTest.stringToUppercase(str);
        assertEquals(expected, actual);
    }

    @Test
    void isPositive() {
        int a = -1;
        boolean expected = false;
        boolean actual = MethodForTest.isPositive(a);
        assertEquals(expected, actual);
    }

}