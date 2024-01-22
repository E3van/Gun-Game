import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
    private Movement horizontal; 
    private Movement vertical;

    public Player(int playerx, int playery, int width, int height){
        this.character = new Rectangle(playerx, playery, width, height);
        this.horizontal = Movement.STOP; 
        this.vertical = Movement.STOP; 
    }

   // private Movement horizontal;
   // private Rectangle hitbox;

    public void update(){
        if(this.horizontal == Movement.LEFT){
            this.character.x -= 5;
        }else if(this.horizontal == Movement.RIGHT){
            this.character.x +=5;
        }else if(this.vertical == Movement.JUMP){
            this.character.y -= 5;
        }else if(this.vertical == Movement.DROP){
            this.character.y += 5;
        }
    }

    public void moveleft(){
        this.horizontal = Movement.LEFT;
    }

    public void moveRight(){
        this.horizontal = Movement.RIGHT;
    }

    public void jump(){
        this.vertical = Movement.JUMP;
    }

    public void movedown(){
        this.vertical = Movement.DROP;
    }

    public void stop(){
        this.horizontal = Movement.STOP;
        this.vertical = Movement.STOP;
    }

    public void draw(Graphics2D g){
        g.setColor(Color.RED);
        g.fill(this.character);
    } 


    //public void character(Graphics2D g){
        //make the image the rectangle
   // }
}
