package test;

public class MethodForTest {
    public static void main(String[] args) {

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static boolean isEven(int a){
        return a%2 == 0? true:false;
    }

    public static int product(int a, int b) {
        return a*b;
    }

    public static String stringToUppercase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPositive(int a) {
        return a > 0? true:false;
    }
}
