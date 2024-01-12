import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Graphics;


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

    public void update(){
        if(this.movement == Movement.LEFT){
            this.character.x -= 5;
        }else if(this.movement == Movement.RIGHT){
            this.character.x +=5;
        }else if(this.movement == Movement.JUMP){
            this.character.y -= 5;
        }else if(this.movement == Movement.DROP){
            this.character.y += 5;
        }
    }

    public void moveleft(){
        this.movement = Movement.LEFT;
    }

    public void moveRight(){
        this.movement = Movement.RIGHT;
    }

    public void jump(){
        this.movement = Movement.JUMP;
    }

    public void movedown(){
        this.movement = Movement.DROP;
    }

    public void character(Graphics2D g){
        //make the image the rectangle
    }
}
