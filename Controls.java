import java.awt.image.BufferedImage;

public class Controls {
    
    private Screen screen;
    private Map map;

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

    
}
