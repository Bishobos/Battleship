package Battleship;

public class BattleshipMain {
    public static void main(String[] args) {

        ship myShip = new ship(new int[]{1, 2, 3});

        System.out.println("Welcome to Battleship!\n" +
                "Enemy ship is hiding within positions 0-6\n" +
                "Sink it by hitting all 3 positions!");
        int shots = 0;
        while(myShip.hits<3){
            shots++;
            myShip.checkHit();
            System.out.println("You've shot " + shots + " times!");

        }
        System.out.println("\n=== Congratulations, you've won! ===");
        }
    }

