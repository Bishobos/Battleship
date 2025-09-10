package Battleship;

public class BattleshipMain {
    public static void main(String[] args) {

        ship myShip = new ship(10, new int[]{1, 2, 3, 7, 8});

        System.out.println("Welcome to Battleship!\n" +
                "Enemy ship is hiding within positions 0-"+ myShip.oceansize + "\n" +
                "Sink it by hitting all " + myShip.shiplength + " positions!");
        int shots = 0;
        while(myShip.hits< myShip.shiplength){
            shots++;
            System.out.print("Where do you wish to shoot? (0-" +myShip.oceansize+")" );

            myShip.checkHit();
            System.out.println("You've shot " + shots + " times!");

        }
        if (shots> myShip.shiplength+(myShip.shiplength)/2){
            System.out.println("\nSuch a waste of ammo...");
        }

        System.out.println("\n=== Congratulations, you've won! ===");
        }
    }

