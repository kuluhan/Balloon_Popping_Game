/*
 * Description: Rectangle class which is a subclass of the Shape class. It has one constructor which takes width and height values as in types
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class Rectangle extends Shape implements Selectable
{
   // properties
   int width;
   int height;
   boolean selected;
   String type;

   // constructors
   public Rectangle(int width, int height)
   {
      this.width = width;
      this.height = height;
      selected = false;
      type = "rectangle";
   }
   
   // methods
   /*
 * method that calculates the area of a rectangle
 * @param none
 * @return width*height
 */
   @Override
   public double getArea()
   {
      return width*height;
   }
   /*
 * method to print out the information of the rectangle object
 * @param none
 * @return "rectangle \n" + "width: " + width + "\nheight:" + height + "\narea: " + getArea() + "\nselected: " + selected
 */
   public String toString()
   {
      return "rectangle \n" + "width: " + width + "\nheight:" + height + "\narea: " + getArea() + "\nselected: " + selected;
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
   public Shape contains(int x, int y)
   {
      return null;
   }
   
   public String getType()
   {
      return type;
   }
   
   public int getWidth()
   {
      return width;
   }
   public double getHeight()
   {
      return height;
   }
   
}