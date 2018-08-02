/*
 * Description: class Square that is a subclass of the class Rectangle and has 1 constructor which takes 1 int value of side
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class Square extends Rectangle
{
   // properties
   int side;
   
   // constructors
   
   public Square(int side)
   {
      super(side,side);
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
      return super.getArea();
   }
}