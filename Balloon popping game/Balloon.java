/**
 * Balloon class that extends your Circle class and implements Drawable
 * @author Kuluhan Binici
 * @date 03.04.2017
 */ 
import java.awt.*;
import javax.swing.*;

public class Balloon extends Circle implements Drawable
{
  public static final int MAX_SIZE = 100;
  
  public Balloon(int x,int y) // constructor that creates balloons at desired locations
  {
    super(25);
    setLocation(x,y);
  }
  
  /*
   * grow method  that increases the radius of 
   * the balloon (Circle) by a fixed number of units, up to a maximum size, at which point 
   * the circle should be selected and the radius set to zero.
   * @param none
   * @return none
   */
  protected void grow()
  {
    boolean tooBig;
    tooBig = (getRadius()>100);
    if(tooBig)
    {
      setSelected(true);
      setRadius(0);
    }
    else
      setRadius((int) getRadius() + 1);
  }
 
  /*
   * method that draws the balloon object
   * @param Graphics g
   * @return none
   */
  @Override
  public void draw(Graphics g) {
    int R = (int) (Math.random( )*256);
    int G = (int)(Math.random( )*256);
    int B= (int)(Math.random( )*256);
    Color randomColor = new Color(R, G, B);
    g.setColor(randomColor);
    int radius = (int) this.getRadius();
    g.fillOval(this.getX() - radius, this.getY() - radius, radius * 2, radius * 2);
  }
  
  public Balloon() // constructor that creates balloons at random locations
  {
    super(25);
    int x= (int)(Math.random()*800);
    int y= (int)(Math.random()*600);
    setLocation(x,y);
  }
}