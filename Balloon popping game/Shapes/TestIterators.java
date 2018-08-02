/* Description: Test class that tests the methods of the IntBagIterator class
 * @author Kuluhan Binici
 * @date 21.03.2017
 */

import java.util.*;

public class TestIterators
{
   public static void main(String[] args)
   {
      // creates an Intbag and adds it ints
      IntBag bag = new IntBag();
      bag.add(1);
      bag.add(2);
      bag.add(3);
      Iterator i, j;
      
      // creates an Iterator using the IntBag object
      i = new IntBagIterator( bag);
      
      // creates a loop to test the methods
      while ( i.hasNext() ) 
      {
         System.out.println( i.next() );
         
//         j = new IntBagIterator( bag);
         j = bag.iterator();
         
         while ( j.hasNext() )
         {
            System.out.println( "--" + j.next() );
         }
      }
   }
}