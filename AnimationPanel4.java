import java.awt.*;
import javax.swing.*;

public class AnimationPanel4 extends JPanel{
 
  // Properties
  
  int intX = 200;
  int intY = 100;
  int intX2 = 100;
  int intY2 = 100;
 
  
  // Methods
  // Let's override how the boring JPanel paints
  // Let's paint our panel the way we want.
  public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,500,500);
    g.setColor(Color.WHITE);
    g.fillOval(intX,intY,75,75);
    g.setColor(Color.BLUE);
    g.fillOval(intX2, intY2, 75,75);
    g.setColor(Color.RED);
    g.fillRect(150,250, 200,100);
   }
  
  // Constructor
  public AnimationPanel4(){
    super();
}
}