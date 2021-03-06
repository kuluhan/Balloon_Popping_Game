/*
 * Description: ShapeContainer class which has one constructor which has an ArrayList that contains shape objects 
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class ShapeContainer implements Iterable
{
   
   // properties
   ArrayList<Shape> list;
   
   // constructors
   public ShapeContainer()
   {
      list = new ArrayList<Shape>();
   }
   
   // methods
   /*
 * method that adds a new shape to the container
 * @param Shape s
 * @return none
 */
   public void add(Shape s)
   {
      list.add(s);
   }
   /*
 * method that returns the size of the Arraylist
 * @param none
 * @return list.size()
 */
   public int getSize()
   {
      return list.size();
   }
   /*
 * method that returns the Shape object at the given index
 * @param int i
 * @return list.get(i)
 */
   public Shape getShape(int i)
   {
      return list.get(i);
   }
   /*
 * method that changes the shape object at the specified index
 * @param int i, Shape s
 * @return list.set(i,s)
 */
   public void setShape(int i, Shape s)
   {
      list.set(i,s);
   }
   /*
 * method that returns the total area in the container
 * @param none
 * @return totalArea
 */
   public double getArea()
   {
      int totalArea = 0;
      for(int i = 0; i < list.size(); i++)
      {
         totalArea += (list.get(i)).getArea();
      }
      return totalArea;
   }
   /*
 * method that returns the information about all the objects in the container
 * @param none
 * @return str
 */
   public String toString()
   {
      String str = "";
      for(int i = 0; i < list.size(); i++)
      {
         if(list.get(i) != null)
         {
            str += (list.get(i)).toString() + "\n";
         }
         else
            str += "null \n";
      }
      return str;
   }
   
   public void setSelected(boolean b)
   {
      
   }
   
   public boolean getSelected()
   {
      return false;
   }
   /*
 * method that returns the shape object which contains the given x and y 
 * @param int x, int y
 * @return list.get(i)
 */
   public Shape contains(int x, int y)
   {
      
      for(int i = 0; i < list.size(); i++)
      {
         if(((list.get(i)).toString()).charAt(0) == 'r')
         {
            if(Math.abs(((Rectangle)list.get(i)).getWidth()) >= 2 * x && Math.abs(((Rectangle)list.get(i)).getHeight()) >= 2* y)
               return list.get(i);
         }
         else if(((list.get(i)).toString()).charAt(0) == 'c')
         {
            if(((Circle)list.get(i)).getRadius() * ((Circle)list.get(i)).getRadius() >= x*x + y*y )
               return list.get(i);
         }
      }
      return null;
   }
   
   
   public int selectAllAt(int x, int y) {
      int count =0;
      for(int i=0;i<getSize();i++)
      {
         Balloon s = (Balloon) (list.get(i));
         if(s.contains(x,y) != null)
         {
            s.setSelected(true);
            count++;
         }
      }
      return count;
//      int count = 0;
//      for (Shape shape : this.list) {
//         Shape s = ((Selectable)((Object)shape)).contains(x, y);
//         if (s == null) continue;
//         ((Selectable)((Object)s)).setSelected(true);
//         ++count;
//      }
//      return count;
   }
   
   void removeSelected()
  {
    for(int i=0;i < getSize();i++)
    {
      Selectable s = (Selectable) list.get(i);
      if(s.getSelected() == true)
      {
        list.remove(i);
        i--;
      }
    }
  }
   
//   public Iterator iterator()
//   {
//      return null;
//   }

   public Iterator<Shape> iterator()
   {
      return list.iterator();
   }
}
