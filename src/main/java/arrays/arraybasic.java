package arrays;

import org.w3c.dom.ls.LSOutput;

public class arraybasic {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array elements: ");
        printResult(numbers);

        System.out.println("Sum");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum is " + sum);

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Largest number in the array: " + max);

        System.out.print("The second Array elements: ");
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 11;
        }
        printResult(numbers2);

        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers3[i] = numbers[i] + numbers2[i];
        }
        System.out.print("The new Array elements: ");
        printResult(numbers3);
    }

    public static void printResult(int arr[]) {
        for (int number : arr) {
            System.out.println(number);
        }
    }

}
