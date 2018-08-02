/* Description: IntBagIterator class that implements the Iterator interface.
 * Has 1 constructor that takes an IntBag object as a parameter and uses its methods to iterate through it
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class IntBagIterator implements Iterator
{
   // properties
   IntBag aBag;
   int index;
   // constructors
   public IntBagIterator(IntBag bag)
   {
      aBag = bag;
      index = 0;
   }
   /* method that overrides the next() method of the Iterator interface
    * it gives the next object in a set of objects
    * @param none
    * @return aBag.get(index - 1)
    */
   public Object next()
   {
      index++;
      return aBag.get(index - 1);
   }

//   public int nextInt()
//   {
//      index++;
//      return aBag.get(index - 1);
//   }
   
   /* method that overrides the hasNext() method of the Iterator interface
    * it reports if there is more objects in the set of objects
    * @param none
    * @return true, false
    */
   public boolean hasNext()
   {
      if(index >= aBag.size())
         return false;
      else
         return true;
   }
}