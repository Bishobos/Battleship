package Battleship;

public class ship {
    boolean[] placement = new boolean[7];
    int hits = 0;

    public ship() {
        this.placement[6] = true;
        this.placement[5] = true;
        this.placement[4] = true;
    }

    public ship(int[] placement){
        this.placement[placement[0]] = true;
        this.placement[placement[1]] = true;
        this.placement[placement[2]] = true;
    }

    public void checkHit(){
        int userInput = GameHelper.getUserInput();

        boolean hit = this.placement[userInput];

        if(hit){
            this.placement[userInput] = false;
            this.hits++;
            System.out.println("You hit!");
        }if(!hit){
            System.out.println("You missed!");
        }

    }

}