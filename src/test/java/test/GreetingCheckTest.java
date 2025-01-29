package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingCheckTest {

    @Test
    void isGreeting() {
        String str = "Hello";
        boolean expected = true;
        boolean actual = GreetingCheck.isGreeting(str);
    }
}