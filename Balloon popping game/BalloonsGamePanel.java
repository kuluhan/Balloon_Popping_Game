/**
 * BalloonGamePanel class that extends JPanel to design a balloon popping game.
 * @author Kuluhan Binici
 * @date 03.04.2017
 */ 
import java.util.Iterator;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class BalloonsGamePanel extends JPanel
{
  private int passedTime;
  private ShapeContainer balloons;
  private Timer timer = new Timer(125,new TimerListener());
  private JLabel score = new JLabel();
  private int points;
  private static BalloonsGamePanel myPanel;
  private boolean isOver;
  
  
  private BalloonsGamePanel()
  {
    setSize(800,600);
    balloons = new ShapeContainer();
    setLocation(0,0);
    points=0;
    passedTime=0;
    isOver = false;
    
    for(int i=0;i<25;i++)
    {
      balloons.add(new Balloon());
    }
    setVisible(true);
    timer.start();
    addMouseListener(new BalloonBurster());
    score.setVisible(true);
    add(score);
  }
  
  // as the construcor is private this method exists to call it
  public static BalloonsGamePanel getPanel()
  {
    if(myPanel == null)
      myPanel = new BalloonsGamePanel();
    return myPanel;
  }
  
  /*method that returns the points of the user
   * @param none
   * @return none
   */
  public int getPoints()
  {
    return points;
  }
  /*method that uses the draw method of the Balloon class to draw balloons
   * @param Graphics g
   * @return none
   */
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Iterator itr = balloons.iterator(); 
    while(itr.hasNext())
    {
      Shape s = (Shape) itr.next();
      ((Balloon) s).draw(g);
    }
  }
  
  class TimerListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      Iterator itr = balloons.iterator();
      while(itr.hasNext())
      {
        Balloon b = (Balloon) itr.next();
        b.grow();
      }
      repaint();
      passedTime++;
      if(passedTime>120)
      {
        int n = JOptionPane.showConfirmDialog(null,"Wanna play another?","Game is over",JOptionPane.YES_NO_OPTION);
        if(n== JOptionPane.YES_OPTION)
        {
          setSize(800,600);
          setLocation(0,0);
          points=0;
          passedTime=0;
          isOver = false;
          
          balloons = new ShapeContainer();
          for(int i=0;i<25;i++)
          {
            balloons.add(new Balloon());
          }
          setVisible(true);
          timer.start();
          addMouseListener(new BalloonBurster());
          score.setVisible(true);
          add(score);
          score.setText("");
        }
        else
          timer.stop();
      }
    }
  }
  
  class BalloonBurster implements MouseListener //receives mouse clicks and pops the balloons
  {
    public void mouseExited(MouseEvent e)
    {
      
    }
    
    public void mousePressed(MouseEvent e) //handles mouse interactions.
    {
      if(!isOver)
      {
        int x= e.getX();
        int y= e.getY();
        int count = balloons.selectAllAt(x,y);
        balloons.removeSelected();
        if(count >1)
          points += count;
        if(balloons.getSize()<15)
        {
          for(int i=0;i<((int)Math.random()*10)+3;i++)
            balloons.add(new Balloon());
        }
        score.setText("Your score is: " + points);
      }
      else
      {
      }
    }
    
    public void mouseEntered(MouseEvent e)
    {
      
    }
    
    public void mouseReleased(MouseEvent e)
    {
      
    }
    
    public void mouseClicked(MouseEvent e)
    {
      
    }
  }
}

