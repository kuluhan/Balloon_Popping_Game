/* Description: IntBag class that has 2 constructors: 1 default and 1 that asks 
 * for the size to create the array of ints it contains
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;
public class IntBag implements IntIterator
{
   // properties
   int[] bag;
   int valid;
   int index = 0;
   // constructors
   public IntBag()
   {
      bag = new int[100];
      valid = 0;
      index = 0;
   }
   public IntBag(int max)
   {
      bag = new int[max];
      valid = 0;
      index = 0;
   }
   
   // methods
   /* method that adds a given x value to the given index if the index is within valid
    * @param int i, int x
    * @return none
    */
   public void add(int i, int x)
   {
      if(i < valid && valid < bag.length )
      {
         for(int a = valid; i < a; a--)
            bag[a] = bag[a - 1];
         bag[i] = x;
         valid++;
      }
      
   }
   /* method that adds a given x value to the end of the valid index
    * @param int x
    * @return none
    */
   public void add(int x)
   {
      if(valid < bag.length)
      {
         bag[valid] = x;
         valid++;
      }
   }
   /* method that removes the value at the specified index
    * @param int i
    * @return none
    */
   public void remove(int i)
   {
      if(i < valid && valid < bag.length)
      {
         bag[i] = 0;
         for(int a = i; a < valid; a++)
         {
            bag[a] = bag[a + 1];
         }
         valid--;
      }
   }
   /* method that returns the information about an IntBag object
    * @param none
    * @return Arrays.toString(bag)
    */
   public String toString()
   {
      return Arrays.toString(bag);
   }
   /* method that returns if the Int
    * bag contains a given x 
    * @param int x
    * @return true, false
    */
   public boolean contains(int x)
   {
      for(int i = 0; i < bag.length; i++)
      {
         if(bag[i] == x)
            return true;
      }
      return false;
   }
   /* method that returns the number of valid indexes
    * @param none
    * @return valid
    */
   public int size()
   {
      return valid;
   }
   /* method that returns the element at the given index in a set of elements
    * @param int i
    * @return bag[i]
    */
   public int get(int i)
   {
      return bag[i];
   }
   /* method that finds the indexes of the elements which are equal to a give value
    * @param int x
    * @return str
    */
   public String findAll(int x)
   {
      String str;
      str = "";
      for(int i = 0; i < size(); i++)
      {
         if( x == get(i))
            str += i + " "; 
      }
      return str;
   }
   /* method that returns the next int in an int[]
    * @param none
    * @return bag[index - 1]
    */
   public int nextInt()
   {
      index++;
      return bag[index - 1];
   }
   /* method that overrides the hasNext() method of the Iterator interface
    * it reports if there is more objects in the set of objects
    * @param none
    * @return true, false
    */
   public boolean hasNext()
   {
      if(index >= bag.length - 1)
         return false;
      else
         return true;
   }
   /* method that overrides the next() method of the Iterator interface
    * it gives the next object in a set of objects
    * @param none
    * @return aBag.get(index - 1)
    */
   public Object next()
   {
      return null;
   }
   /* method that creates an IntBagIterator with a clone of the IntBag class object
    * @param none
    * @return iterator
    */
   public Iterator iterator()
   {
      IntBag intBag = new IntBag(valid);
      for(int i = 0; i < valid; i++)
      {
         intBag.add(bag[i]);
      }
      IntBagIterator iterator = new IntBagIterator(intBag);
      return iterator;
   }
}