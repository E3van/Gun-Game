public class Player {
//create a player class that allows 2 or more players to move up, down, left and right
    private int playerx;
    private int playery;

    public Player(int playerx, int playery){
        this.playerx = playerx;
        this.playery = playery;

    }

    public int getxPos(){
        return this.playerx;
    }

    public int getyPos(){
        return this.playery;
    }
}
