/*
 * Description: Program that tests the methods of the subclasses of the shape object and the interfaces which they implement
 * @author Kuluhan Binici
 * @date 21.03.2017
 */
import java.util.*;

public class ShapeTester
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      // variables
      int selection;
      Shape shape;
      char shapeSel = ' ';
      int width;
      int height;
      int radius;
      double area;
      ShapeContainer container;
      int x,y;
      // constants
      
      // program code
      // first menu selection that prevents users from skipping step 1
      menu();
      selection = scan.nextInt();
      if(selection == 1)
      {
         // after user selects step 1 the program creates a loop
         container = new ShapeContainer();
         do{
            // selection in the loop
            menu();
            selection = scan.nextInt();
            // option 1 creates a new container
            if(selection == 1)
            {
               container = new ShapeContainer();
            }
            // option 2 adds a desired shape with desired size to the container
            else if(selection == 2)
            {
               System.out.println("Enter r to add a rectangle or c to add a circle");
               shapeSel = scan.next().charAt(0);
               // checks if the shape is rectangle
               if(shapeSel == 'r')
               {
                  System.out.println("Enter width: ");
                  width = scan.nextInt();
                  System.out.println("Enter height: ");
                  height = scan.nextInt();
                  container.add(new Rectangle(width, height));
               }
               // checks if the shape is circle
               else if(shapeSel == 'c')
               {
                  System.out.println("Enter radius: ");
                  radius = scan.nextInt();
                  container.add(new Circle(radius));
               }
               
            }
            // option 3 gives the total area of the shapes in the container
            else if(selection == 3)
            {
               area = container.getArea();
               System.out.println(area);
            }
            // option 4 prints the information of the objects in the container
            else if(selection == 4)
            {
               System.out.println(container);
            }
            // option 5 asks for an x and y value and changes the selected state of the object which contains them
            else if(selection == 5)
            {
               // asks for the x and y values
               System.out.println("Enter X: ");
               x = scan.nextInt();
               System.out.println("Enter Y: ");
               y = scan.nextInt();
               // checks if th eobject is null to prevent errors
               if(container.contains(x,y) != null)
               {
                  // checks if the object is a rectangle
                  if(((container.contains(x,y)).toString()).charAt(0) == 'r' )
                  {
                     if(((Rectangle)container.contains(x,y)).getSelected() && container.contains(x,y) != null)
                     {
                        ((Rectangle)container.contains(x,y)).setSelected(false);
                     }
                     else if(!(((Rectangle)container.contains(x,y)).getSelected()) && container.contains(x,y) != null)
                     {
                        ((Rectangle)container.contains(x,y)).setSelected(true);
                     }
                     
                  }
                  // checks if the object is a circle
                  else if(((container.contains(x,y)).toString()).charAt(0) == 'c')
                  {
                     if(((Circle)container.contains(x,y)).getSelected() && container.contains(x,y) != null)
                     {
                        ((Circle)container.contains(x,y)).setSelected(false);
                     }
                     else if(!(((Circle)container.contains(x,y)).getSelected()) && container.contains(x,y) != null)
                     {
                        ((Circle)container.contains(x,y)).setSelected(true);
                     }
                  }
               }
               // prints an error message if the object is null
               else if(container.contains(x,y) == null)
               {
                  System.out.println("There is no shape in the collection that contains the given values!");
               }
            }
            // option 6 removes the selected objects from the container
            else if(selection == 6)
            {
               for(int i = 0; i < container.getSize(); i++)
               {
                  if(((container.getShape(i)).toString()).charAt(0) == 'r')
                  {
                     if(((Rectangle) container.getShape(i)).getSelected())
                     {
                        container.setShape(i, null);
                     }
                  }
                  else if(((container.getShape(i)).toString()).charAt(0) == 'c')
                  {
                     if(((Circle) container.getShape(i)).getSelected())
                     {
                        container.setShape(i, null);
                     }
                  }
               }
            }
          // loop ends when the selection is 7  
         }while(selection != 7);
      }
      System.out.println("Goodbye!");
      
   }
   /*
 * static method that prints the menu for the ShapeTester class 
 * @param none
 * @return none
 */
   public static void menu()
   {
      System.out.println("1. create an empty set of shapes");
      System.out.println("2. add circle and rectangle shapes");    
      System.out.println("3. compute & print out the total surface area of the entire set of shapes");
      System.out.println("4. print out information about all of the shapes in the container");
      System.out.println("5. find the first Shape that contains a given x, y point and toggle its selected state");
      System.out.println("6. remove all selected shapes from the set of  shapes");
      System.out.println("7. quit");
      System.out.println("-----------------------------");
      System.out.println("Enter selection: ");
   }
}