import java.lang.reflect.MalformedParameterizedTypeException;

public class IfMethod {

    public static void main(String[] args) {
        int a1 = 20;
        int b1 = 30;
        int sum = addMethod(a1, b1);
        int s1 = subtractMethod(a1, b1);
        System.out.println("The sum of " + a1 + " + " + b1 + " = " + sum);
        System.out.println("The subtract of " + a1 + " - " + b1 + " = " + s1);
        double d1 = 3.141592653;
        double d2 = 2.097479126;
        double d3 = addMethod(d1, d2);
        System.out.println("The sum of " + d1 + " + " + d2 + " = " + d3);

        int a2 = -10;
        int a3 = 1900;
        int a2Postivie = makePositive(a2);
        int a3Positive = makePositive(a3);
        System.out.println("The positive value of a3 is" + " " + a3Positive);
        System.out.println("The positive value of a2 is" + " " + a2Postivie);

        int m1 = 50;
        int m2 = 51;
        if (m1 > m2) {
            subtractMethod(m1, m2);
        } else {
            addMethod(m1, m2);
        }

        int m1Result = checkEvenNumber(m1);
        int m2Result = checkEvenNumber(m2);
        System.out.println("EvenNumber is" + " " + m1Result);
        System.out.println("EvenNumber is" + " " + m2Result);

        String str = "Guten Morgen";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is it a Palindrome? When it is false, then it means it is not Palindrome" + " " + isPalindrome);

    }


    public static int addMethod(int a, int b) {
//        int c = a + b;
//        return c;
        return a + b;
    }

    public static double addMethod(double a, double b) {
//        double c = a + b;
//        return c;
        return a + b;
    }

    public static int subtractMethod(int a, int b) {
//        int c = a - b;
//        return c;
        return a - b;
    }

    public static int makePositive(int a) {
//        if (a >= 0) {
//            return a;
//        } else {
//            return -a;
//        }
        return a >= 0 ? a : -a;
    }

    public static int checkEvenNumber(int a) {
//        int b = a % 2;
//        if (b == 0) {
//            return a;
//        } else {
//            return a * 2;
//        }
        return a % 2 == 0 ? a : a * 2;
    }

    public static boolean checkPalindrome(String str) {
        if (str == "null" || str.length() == 0) return false;
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
