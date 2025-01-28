public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, Java!");
        System.out.println("Java is cool!");

        System.out.println("------------------------------");
        System.out.println("Hier sind die Aufgaben von Int");
        int a = 4;
        int b = 2;
        int sum = a + b;

        System.out.println("The sum is: " + sum);
        int minus = a - b;
        System.out.println("The subtraction is: " + minus);
        int multiplication = a * b;
        System.out.println("The multiplication is: " + multiplication);
        int division = a / b;
        System.out.println("The division is: " + division);
        boolean c = multiplication > division;
        System.out.println("Multipication result is greater than division: " + c);
        boolean d = division < minus;
        System.out.println("Division result is less than subtraction: " + d);
        boolean e = multiplication == minus;
        System.out.println("Multipication result equals to subtraction: " + e);

        System.out.println("------------------------------");
        System.out.println("Hier sind die Aufgaben von Float");
        float f1 = 2.1345678f;
        float f2 = 2.2309678f;
        float sumFloat = f1 + f2;
        System.out.println("The sum is: " + sumFloat);
        float minusFloat = f1 - f2;
        System.out.println("The subtraction is: " + minusFloat);
        float multiplicationFloat = f1 * f2;
        System.out.println("The multiplication is: " + multiplicationFloat);
        float divisionFloat = f1 / f2;
        System.out.println("The division is: " + division);
        boolean c1 = multiplicationFloat > divisionFloat;
        System.out.println("Multipication result is greater than division: " + c1);
        boolean d1 = divisionFloat < minusFloat;
        System.out.println("Division result is less than subtraction: " + d1);
        boolean e1 = multiplicationFloat == minusFloat;
        System.out.println("Multipication result equals to subtraction: " + e1);

        System.out.println("------------------------------");
        System.out.println("Hier sind die Aufgaben von Double");
        double d2 = 2.134567812345;
        double d3 = 2.23096781234567;
        double sumDouble = d2 + d3;
        System.out.println("The sum is: " + sumDouble);
        double minusDouble = d2 - d3;
        System.out.println("The subtraction is: " + minusDouble);
        double multiplicationDouble = d2 * d3;
        System.out.println("The multiplication is: " + multiplicationDouble);
        double divisionDouble = d2 / d3;
        System.out.println("The division is: " + divisionDouble);
        boolean c2 = multiplicationDouble > divisionDouble;
        System.out.println("Multipication result is greater than division: " + c2);
        boolean d4 = divisionDouble < minusDouble;
        System.out.println("Division result is less than subtraction: " + d4);
        boolean e2 = multiplicationDouble == minusDouble;
        System.out.println("Multipication result equals to subtraction: " + e2);

    }
}
