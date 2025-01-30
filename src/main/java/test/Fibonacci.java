package test;

public class Fibonacci {

    public static void main(String[] args) {

    }


    public static int calculate(int i) {
        int a = 0;
        int b = 1;
        int result = 0;

        if (i == 1) {
            return a;
        } else if (i == 2) {
            return b;
        }
        for (int index = 2; index < i; index++) {
            result = a +b;
            a = b;
            b = result;
            System.out.println("a: "+a);
            System.out.println("b: "+b);
        }
        return result;
    }
}
