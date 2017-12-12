import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class proGUI4 implements ActionListener, KeyListener{
  
  // Properties
  
  JFrame frame;
  AnimationPanel4 panel;
  Timer timer;
  boolean blnaPressed = false;
  boolean blnsPressed = false;
  boolean blndPressed = false;
  boolean blnwPressed = false;
  boolean blnUpPressed = false;
  boolean blnDownPressed = false;
  boolean blnLeftPressed = false;
  boolean blnRightPressed = false;
  
  
  
  // Methods
  
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == timer){
       if(blnaPressed == true){
        panel.intX = panel.intX -2;
        Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX, panel.intY, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intX = panel.intX + 2;
        }
      }
      if(blnsPressed == true){
        panel.intY = panel.intY + 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX, panel.intY, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intY = panel.intY - 2;
        }
               }
      if(blndPressed == true){
        panel.intX = panel.intX + 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX, panel.intY, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intX = panel.intX - 2;
        }
               }
      if(blnwPressed == true){
        panel.intY = panel.intY -2;
         Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX, panel.intY, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
       Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intY = panel.intY + 2;
        }
           }
      if(blnLeftPressed == true){
        panel.intX2 = panel.intX2 - 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX2, panel.intY2, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intX2 = panel.intX2 + 2;
        }
      }
      if(blnUpPressed == true){
        panel.intY2 = panel.intY2 - 2;
       Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX2, panel.intY2, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
       Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intY2 = panel.intY2 + 2;
        }
           }
      if(blnRightPressed == true){
        panel.intX2 = panel.intX2 + 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX2, panel.intY2, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intX2 = panel.intX2- 2;
        }
               }
      if(blnDownPressed == true){
        panel.intY2 = panel.intY2 + 2;
        Ellipse2D.Double ball = new Ellipse2D.Double(panel.intX2, panel.intY2, 75, 75);
        Rectangle2D.Double bar = new Rectangle2D.Double(150,250,200,100);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0,500,500);
        if(ball.intersects(bar) == true || !screen.contains(ball.getBounds())){
          panel.intY2 = panel.intY2 - 2;
        }
               }
      panel.repaint();
    }
  }
  public void keyReleased(KeyEvent evt){
//    System.out.println("Something was released");
    // Released only happens when a key is released
    if(evt.getKeyChar() == 'a'){
      blnaPressed = false;
    }else if (evt.getKeyChar() == 's'){
      blnsPressed = false;
  }else if(evt.getKeyChar() == 'd'){
      blndPressed = false;
  }else if(evt.getKeyChar() == 'w'){
      blnwPressed = false;
  }
   if(evt.getExtendedKeyCode() == 37){
      blnLeftPressed = false;
    }else  if(evt.getExtendedKeyCode() == 38){
      blnUpPressed = false;
    }else  if(evt.getExtendedKeyCode() == 39){
      blnRightPressed = false;
    }else  if(evt.getExtendedKeyCode() == 40){
      blnDownPressed = false;
  }
  }
  public void keyPressed(KeyEvent evt){
        // The getKeyChar metthod works and returns a character
    // The getKeyCode method does work and returns an integer
//    System.out.println("Something was pressed");
//  System.out.println(evt.getKeyChar());
//  System.out.println(evt.getExtendedKeyCode());
    // Pressed only happens when a key is pressed.
    if(evt.getKeyChar() == 'a'){
      blnaPressed = true;
    }else if (evt.getKeyChar() == 's'){
      blnsPressed = true;
    }else if(evt.getKeyChar() == 'd'){
      blndPressed = true;
    }else if(evt.getKeyChar() == 'w'){
      blnwPressed = true;
    }
    if(evt.getExtendedKeyCode() == 37){
      blnLeftPressed = true;
    }else  if(evt.getExtendedKeyCode() == 38){
      blnUpPressed = true;
    }else  if(evt.getExtendedKeyCode() == 39){
      blnRightPressed = true;
    }else  if(evt.getExtendedKeyCode() == 40){
      blnDownPressed = true;
  }
  }
  public void keyTyped(KeyEvent evt){
    // The getKeyChar metthod works and returns a character
    // The getKeyCode method does not work and returns 0
//  System.out.println("Something was typed");
//  System.out.println(evt.getKeyChar());
//  System.out.println(evt.getExtendedKeyCode());
  // Typed only happens when a key is pressed then released.
  // BUT Windows has a feature called "key repetition". 
  // If you hold a key down, it will re-press and re-type. 
  // On Mac/Linux, typed only happens when you press and release.
//  if(evt.getKeyChar() == 'd'){
//    panel.intX = panel.intX + 2;
//  }else if(evt.getKeyChar() == 'a'){
//    panel.intX = panel.intX - 2;
//  }else if(evt.getKeyChar() == 'w'){
//    panel.intY = panel.intY - 2;
//  }else if(evt.getKeyChar() == 's'){
//    panel.intY = panel.intY + 2;
//  }
  }
  // Constructor
  
  public proGUI4(){
    
    panel = new AnimationPanel4();
    panel.setPreferredSize(new Dimension(500,500));
    panel.setLayout(null);
    panel.addKeyListener(this);
    
    timer = new Timer(1000/60, this);
    timer.start();
    
    frame = new JFrame("Pro GUI 3");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(panel);
    frame.pack();
    frame.addKeyListener(this);
    frame.setVisible(true);
    
  }
  
  // Main Method
  
  public static void main(String[]args){
    proGUI4 PG4 = new proGUI4();
  }
}
