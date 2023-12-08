import java.awt.image.BufferedImage;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controls {
    
    private Screen screen;
    private Map map;
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
         //update the display
 //        //this.screen.setImage(this.map.getImage());
 //        this.screen.setDescription(this.map.getDescription());
        
    }

    public void jumpUp(){
 //       this.map.moveNorth();
        this.updateScreen();
    }

    public void moveLeft(){
 //       this.map.moveEast();
        this.updateScreen();
    }
    
    public void moveDown(){
 //       this.map.moveSouth();
        this.updateScreen();
    }

    public void moveRight(){
 //       this.map.moveWest();
        this.updateScreen();
    }

    // Used to implements any of the Keyboard Actions
  private class Keyboard extends KeyAdapter {

    // if a key has been pressed down
    @Override
    public void keyPressed(KeyEvent e) {
    
      
      // determine which key was pressed
      int key = e.getKeyCode();
      if(key == KeyEvent.VK_RIGHT){
        right = true;
      }

      if(key == KeyEvent.VK_LEFT){
        left = true;
      }

      if(key == KeyEvent.VK_UP){
        up = true;
      }

      if(key == KeyEvent.VK_DOWN){
        down = true;
      }

      
    }

    // if a key has been released
    @Override
    public void keyReleased(KeyEvent e) {
      // determine which key was pressed
      int key = e.getKeyCode();

      if(key == KeyEvent.VK_RIGHT){
        right = false;
      }

      if(key == KeyEvent.VK_LEFT){
        left = false;
      }

      if(key == KeyEvent.VK_UP){
        up = false;
      }

      if(key == KeyEvent.VK_DOWN){
        down = false;
      }
      
    }
  }

 }

