package Battleship;

public class ship {
    boolean[] placement = new boolean[7];
    int hits = 0;
    int shiplength = 0;
    int oceansize = 0;

    public ship() {
        this.shiplength = 3;
        this.oceansize = 7;
        this.placement[6] = true;
        this.placement[5] = true;
        this.placement[4] = true;
    }

    public ship(int oceansize, int[] placement){
        this.placement = new boolean[oceansize];
        this.oceansize = oceansize;

        this.shiplength = placement.length;
        for(int n: placement){
            this.placement[n] = true;
        }
    }

    public void checkHit(){
        int userInput = GameHelper.getUserInput();

        boolean hit = this.placement[userInput];

        if(hit){
            this.placement[userInput] = false;
            this.hits++;
            System.out.println("\u058D You hit! \u058E");
        }if(!hit){
            System.out.println("\u2205 You missed! \u2205");
        }

    }

}