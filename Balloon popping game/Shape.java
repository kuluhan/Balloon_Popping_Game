/*
 * Description Abstract Shape class which is the parent class of Rectangle and ciecle classes it has one constructor 
 *              to set the x and y values to 0 whenever an instance of the subclasses is created
 * @author     Kuluhan Binici
 * @date       21.03.2017
 */
import java.util.*;
public abstract class Shape implements Locatable
{
   
   // properties
   int x,y;
   
   // constructors
   public Shape()
   {
      x = 0;
      y = 0;
   }
   // methods
   /*
 * method that calculates the area
 * @param none
 */
   public abstract double getArea();
   /*
 * method that returns the x value 
 * @param none
 */
   public abstract int getX();
   /*
 * method that returns the y value 
 * @param none
 */
   public abstract int getY();
   /*
 * method that sets the x and y values 
 * @param int x, int y
 */
   
   public abstract void setLocation(int x, int y);
   /*
 * method to print out the information of a shape object
 * @param none
 */
   public abstract String toString();
   
}