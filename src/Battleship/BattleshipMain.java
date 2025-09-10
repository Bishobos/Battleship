package Battleship;

public class BattleshipMain {
    public static void main(String[] args) {

        ship myShip = new ship(new int[]{1, 2, 3});

        while(myShip.hits<3){
            myShip.checkHit();
        }
        System.out.println("You've won!");
        }
    }

