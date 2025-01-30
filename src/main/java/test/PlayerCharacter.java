package test;

import java.util.Scanner;

public class PlayerCharacter {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter: ");

        String inputText = scanner.nextLine();
        scanner.close();
//
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static boolean move(String str) {
        if (str == "W") {
            y = 1;
        }else if(str == "S"){
            y =-1;
        }
        return true;
    }
}
