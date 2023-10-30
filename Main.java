import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;

// for images
import java.io.File;
import javax.imageio.ImageIO;

public class Main {

  // Set up all the game variables to make the window work
  final int FPS = 60;
  final int WIDTH = 800;
  final int HEIGHT = 600;
  final String TITLE = "My Drawing";
  Drawing drawing;

  // ▼▼▼▼ Your own class variables go under here ▼▼▼▼

  // create rectangles for ground and obstacle blocks
  Rectangle leftGround = new Rectangle (0, 200, 300, 200);
  Rectangle rightGround = new Rectangle (350, 200, 500, 200);
  Rectangle block = new Rectangle (150, 100, 20, 20);

  // create rectangle for character
  Rectangle character = new Rectangle (20, 150, 33, 50);

  // set up boolean statements for movement
  boolean right = false;
  boolean left = false;
  boolean jump = false;

  // set character speed
  int characterSpeed = 4;

  // set up gravity and jumping variables
  int gravity = 1;
  int moveY = 0;
  boolean onGround = false;

  BufferedImage characterImage = loadImage("mario.png");
  
  // ▲▲▲▲ You own class variables go above here ▲▲▲▲

public BufferedImage loadImage (String filename){
  try{
    // try to load images
    BufferedImage image = ImageIO.read(new File(filename));
    return image;
  } catch(Exception e){
    // if an error occurs, print the error
    e.printStackTrace();
  }
  // an error happened
  return null;
}
  
  // ☠ DO NOT TOUCH THE CODE IN THE MAIN METHOD ☠
  // this is what helps create the window
  // I have moved a bunch of code into another file to try and hide it from you
  public Main() {
    // initialize anything you need to before we see it on the screen
    start();
    // create the screen and show it
    drawing = new Drawing(TITLE, WIDTH, HEIGHT, FPS, this);
    // make sure key and mouse events work
    // this is like an actionListener on buttons except it's the keyboard and mouse
    drawing.addKeyListener(new Keyboard());
    Mouse m = new Mouse();
    drawing.addMouseListener(m);
    drawing.addMouseMotionListener(m);
    drawing.addMouseWheelListener(m);
    // start the game loop
    drawing.loop();
  }

  // use this method to set values to anything BEFORE the game starts
  // this only runs at the very beginning
  public void start() {
    
    
  }

  // this is where all the drawing happens
  // put all of your drawing code in this method
  public void paintComponent(Graphics2D g) {

    // draw map
    g.setColor(Color.GREEN);
    g.fill(leftGround);
    g.fill(rightGround);

    // draw block
    g.setColor(Color.BLACK);
    g.fill(block);

    // draw the character
    // g.setColor(Color.RED);
    // g.fill(character);

    // draw the character with image
    g.drawImage(characterImage, character.x, character.y, null);
  }

  // this is the main game loop
  // this is where all of the program logic goes
  // this method automatically repeats over and over again
  // it tries to update as fast as the frames per second you set above (deault is
  // 60 updates each second)
  public void loop() {

    // control character movement
    if(right){
      character.x = character.x + characterSpeed;
    } else if(left){
      character.x = character.x - characterSpeed;
    }

    // if we are jumping
    if(jump && onGround){
      // make moveY negative to cause player to move up
      moveY = -15;
      // no longer on ground
      onGround = false;
    }

    // turn on gravity
    moveY = moveY + gravity;
    character.y = character.y + moveY;
    
    // check and fix our collisions
    onGround = false;
    handleCollision(leftGround);
    handleCollision(rightGround);
    handleCollision(block);
    
  }

  public void handleCollision(Rectangle block){
    // is the player hitting the block?
    if(character.intersects(block)){
      // get the collision rectangle
      Rectangle collision = character.intersection(block);
      // fix up/down motion
      if(collision.height < collision.width){
        // was player moving down?
        if(moveY > 0){
          // move player back up
          character.y = character.y - collision.height;
          // the character will now be on the ground
          onGround = true;
          // stop moving in the y direction
          moveY = 0;
        } else{
          // move player back down
          character.y = character.y + collision.height;
          // stop moving in the y direction
          moveY = 0;
        }
      } else{
        // need to fix left or right collision
        // collision on the left
        if(character.x < block.x){
          // push them to the left
          character.x = character.x - collision.width;
        } else{
          // push them to the right
          character.x = character.x + collision.width;
        }
      }
    }
  }

  // Used to implement any of the Mouse Actions
  private class Mouse extends MouseAdapter {

    // if a mouse button has been pressed down
    @Override
    public void mousePressed(MouseEvent e) {

      
    }

    // if a mouse button has been released
    @Override
    public void mouseReleased(MouseEvent e) {

      
    }

    // if the scroll wheel has been moved
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

      
    }

    // if the mouse has moved positions
    @Override
    public void mouseMoved(MouseEvent e) {

      
    }
  }

  // Used to implements any of the Keyboard Actions
  private class Keyboard extends KeyAdapter {

    // if a key has been pressed down
    @Override
    public void keyPressed(KeyEvent e) {
      // determine which key was pressed
      int key = e.getKeyCode();

      //if(key == KeyEvent.VK_D);
      if(key == KeyEvent.VK_RIGHT){
        right = true;
      //else if(key == KeyEvent.VK_A);
      } else if(key == KeyEvent.VK_LEFT){
        left = true;
      } 
      
      if(key == KeyEvent.VK_SPACE){
        jump = true;
      }
      
    }

    // if a key has been released
    @Override
    public void keyReleased(KeyEvent e) {
      // determine which key was pressed
      int key = e.getKeyCode();

      //if(key == KeyEvent.VK_D);
      if(key == KeyEvent.VK_RIGHT){
        right = false;
      //else if(key == KeyEvent.VK_A);
      } else if(key == KeyEvent.VK_LEFT){
        left = false;
      } 
      
      if(key == KeyEvent.VK_SPACE){
        jump = false;
      }
      
    }
  }
