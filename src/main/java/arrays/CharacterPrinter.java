package arrays;

import java.util.Scanner;

public class CharacterPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a text: ");

        String inputText = scanner.nextLine();
        scanner.close();
        System.out.println("The characters in the input text are: ");
        for (int i =0; i<inputText.length(); i++){
            System.out.println(inputText.charAt(i));
        }

        //Die zweite Formen
        System.out.println("Zweite Formen");
        for (char text: inputText.toCharArray()){
            System.out.println(text);
        }

    }
}
