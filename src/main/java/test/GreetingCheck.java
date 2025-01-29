package test;

import java.util.Arrays;
import java.util.List;

public class GreetingCheck {
    public static void main(String[] args) {
        System.out.println(isGreeting("Hello"));
        System.out.println(isGreeting("ciao"));
        System.out.println(isGreeting("salut"));
    }

    public static boolean isGreeting(String greeting){
        String[] greetingsArray = {"hello",  "hola", "bonjour", "ciao", "salut",
                "hallo", "ahoj ", "czesc "};
        List<String> validGreetings = Arrays.asList(greetingsArray);
        return validGreetings.contains(greeting.toLowerCase());
    }
}
