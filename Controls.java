import java.awt.image.BufferedImage;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controls {
    
    private Screen screen;
    private Map map;
    private Player player;
    private boolean right = false;
    private boolean left = false;
    private boolean up = false;
    private boolean down = false;

    public Controls(Screen screen, String mapFilename){
        this.screen = screen;
       // this.map = new Map(mapFilename);
        this.updateScreen();
        
    }
    private void updateScreen(){
 //        update the display
 //        this.screen.setImage(this.map.getImage());
 //        this.screen.setDescription(this.map.getDescription());
        
    }

    public int jumpUp(int y){
        //add if statement for collision check
        y -= 10;
        return y;
    }

    public int moveLeft(int x){
        //add if statement for collision check
        x -= 5;
        return x;
    }
    
    public int moveDown(int y){
        //add if statement for collision check
        y += 10;
        return y;
    }

    public int moveRight(int x){
        //add if statement for collision check
        x += 5;
        return x;
        
    }
    //check if player can go left right down and up 
    public boolean collision(){
        //add stuff here and delete return false
        return false;
    }

  }