/*
 * Description: Locatable interface that is designed to make the shape objects selectable
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
public interface Selectable
{
   // methods
   
   /*
 * method that returns selected state
 * @param none
 */
   public boolean getSelected();
   /*
 * method that changes the selected state
 * @param none
 */
   public void setSelected(boolean b);
   /*
 * method that returns the shape object which has the given x and y values
 * @param none
 */
   public Shape contains(int x, int y);
}