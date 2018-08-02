/*
 * Description: Locatable interface that is designed to make the shape objects locatable
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
public interface Locatable
{
   // constants
   
   // methods
   /*
 * method that returns the x value
 * @param none
 */
   public int getX();
    /*
 * method that returns the y value
 * @param none
 */
   public int getY();
    /*
 * method that sets thge x and y values
 * @param int x, int y
 */
   public void setLocation(int x, int y);
}