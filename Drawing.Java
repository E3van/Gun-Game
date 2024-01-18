import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * A custom JComponent to paint a picture to the screen
 * @author Zohaib, Abhayjit, Evan
 */
public class Drawing extends JComponent {

    // holds the image
    private BufferedImage image;

    /**
    * Sets the image to be displayed inside of the panel
    * @param img The BufferedImage to show on the pannel
    */
    public void setImage(BufferedImage img) {
        this.image = img;
        // asks the panel to redraw itself
        repaint();
    }

    /**
    * The paint command that is called automatically when showing the panel (not called directly)
    * @param g The graphics object used to paint
    */    
     // Paint the game components here
     @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        // clear the screen
        g.clearRect(0, 0, WIDTH, HEIGHT);

    	if(this.image != null){
            g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
        }else{
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }

  // YOU SHOULDN'T NEED TO MODIFY ANYTHING AFTER THIS POINT
  // Feel free to have a look to see what is happening but don't touch the code down here!
  // This is what makes the window and all of the keyboard and mouse stuff work

  // creates the game window and sets everything up to run properly
  public Drawing() {
    // Initialize the game window
    JFrame frame = new JFrame("Simple 2D Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
    frame.add(this);
   
    frame.addKeyListener(keys);
    this.addMouseListener(mouse);
    this.addMouseMotionListener(mouse);
    this.addMouseWheelListener(mouse);
    // call the setup method for parts that need initialized before the game starts
    setup();

    // Initialize game timer to run at a constant FPS
    gameTimer = new Timer(1000/FPS, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            loop();
            repaint();
        }
    });
    gameTimer.start();
  }

  


  public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              new Drawing();
          }
      });
  }
}