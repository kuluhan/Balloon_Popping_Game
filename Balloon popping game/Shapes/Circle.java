/*
 * Description: Circle class which is a subclass of the Shape class. It has one constructor which takes a radius value
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class Circle extends Shape implements Selectable
{
   // properties
   int radius;
   boolean selected;
   String type;
   // constructors
   public Circle(int radius)
   {
      this.radius = radius;
      selected = false;
      type = "circle";
   }
   
   // methods
   /*
 * method that calculates the area of a circle
 * @param none
 * @return Math.PI * radius * radius
 */
   @Override
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
   
   public double getRadius()
   {
      return radius;
   }
   /*
 * method to print out the information of the circle object
 * @param none
 * @return "circle \n" + "radius: " + radius + "\narea: " + getArea() + "\nselected: " + selected
 */
   public String toString()
   {
      return "circle \n" + "radius: " + radius + "\narea: " + getArea() + "\nselected: " + selected;
   }
   /*
 * method that returns the x value 
 * @param none
 * @return x
 */
   public int getX()
   {
      return x;
   }
   /*
 * method that returns the y value 
 * @param none
 * @return y
 */
   public int getY()
   {
      return y;
   }
   /*
 * method that sets the x and y values 
 * @param int x, int y
 * @return none
 */
   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   /*
 * method that changes the selected state
 * @param boolean b
 * @return none
 */
   public void setSelected(boolean b)
   {
      selected = b;
   }
   /*
 * method that returns the selected state 
 * @param none
 * @return selected
 */
   public boolean getSelected()
   {
      return selected;
   }
   /*
 * method that returns the shape which contains the given x and y value
 * @param int x, int y
 * @return null
 */
   public Shape contains(int x,int y)
  {
    if( ((x-getX())*(x-getX()) + (y-getY())*(y-getY()) )<=getRadius()*getRadius()) //applying pythagorean theorem
    {
      return this;
    }
    else
      return null;
  }
   
   public void setRadius(int r)
   {
      radius = r;
   }
   
//   public String getType()
//   {
//      return type;
//   }
}