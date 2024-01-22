import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Map {
    private Map x;
    private Map y;
    private BufferedImage stadium = loadImage("gungamestadium.png");



    public BufferedImage loadImage (String filename){
      try{
        //try to load images
        BufferedImage image = ImageIO.read(new File(filename));
        return image;
      }catch(Exception e){
        e.printStackTrace();
      }
      return null;
    }

    public void platformsize(int x, int y, Graphics g){
       g.drawImage(stadium, x, y, null);
    }

    

}
