package Battleship;

import java.util.Scanner;

public class GameHelper {
    static Scanner scanner = new Scanner(System.in);

    public static int getUserInput(){
        System.out.print("Where do you wish to shoot? (0-6) ");
        return scanner.nextInt();
    }
}
