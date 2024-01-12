import java.awt.Rectangle;


public class Player {
    private enum Movement{
        JUMP, 
        DROP, 
        LEFT, 
        RIGHT,
        STOP
    }
//create a player class that allows 2 or more players to move up, down, left and right
    private Rectangle character;
    private Movement movement; 

    public Player(int playerx, int playery, int width, int height){
        this.character = new Rectangle(playerx, playery, width, height);
        this.movement = Movement.STOP; 
        

    }
}
