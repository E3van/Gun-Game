import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Screen extends JFrame implements ActionListener{

    // instance variables
    private JPanel mainPanel;

    /**
  * Create and add all parts to the screen
  */
  private void initializeComponents(){
    // set the frame size
    this.setSize(800, 600);
    // make the x button work
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    // create the main panel with a border layout
    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BorderLayout());


   
    
  }

  public void setImage(BufferedImage image){
  

  } 

  public void setDescription(String description){
   
  }


  /** 
  * The method called when a button is pressed
  * @param e The actionEvent created from the button press
  */
  public void actionPerformed(ActionEvent e){
    // determine the action command
    String command = e.getActionCommand();
   
}
}