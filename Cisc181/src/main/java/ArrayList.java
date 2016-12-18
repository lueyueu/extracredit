
public class ArrayList {
	 ArrayList<String> Rectangle = new ArrayList<String>();

	  
	 
	 
	 //elements added to array list*/
	  Rectangle.add("Ajeet");
	  Rectangle.add("Harry");
	  Rectangle.add("Chaitanya");
	  Rectangle.add("Steve");
	  Rectangle.add("Anuj");

	  // Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+Rectangle);

	  /*Add element at the given index*/
	  Rectangle.add(0, "Rahul");
	  Rectangle.add(1, "Justin");
	 
	  // display the size of the arraylist
	   int retval = Rectangle.size();
	   System.out.println("Size of list = " + retval); 
	  
	   /*Remove elements from array list like this*/
	  Rectangle.remove("Chaitanya");
	  Rectangle.remove("Harry");

	  System.out.println("Current array list is:"+Rectangle);

	  /*Remove element from the given index*/
	  Rectangle.remove(1);

	  System.out.println("Current array list is:"+Rectangle);
  
	// display the size of the arraylist
	   int retval = Rectangle.size();
	   System.out.println("Size of list = " + retval); 
}


