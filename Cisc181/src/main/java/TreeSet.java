
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet {
	

	 
	   public static void main(String[] args) {
		  
			TreeSet<Integer> Rectangle = new TreeSet<Integer>();
			
	 
		// To Check if the treeset empty or not
			if (Rectangle.isEmpty()) {
				System.out.print("Rectangle Set is empty.");
			} else {
				System.out.println("Rectangle Set size: " + Rectangle.size());
			}
		
			System.out.println();
			
		// add elements into the treeset
			Rectangle.add(15);
			Rectangle.add(21);
			Rectangle.add(37);
			Rectangle.add(32);
		
		// tests the treeset if is sorted
		Iterator<Integer> iterator = Rectangle.iterator();
		System.out.print("Rectangle set data: ");
	 
		
		// Delete all the data inside of the treeset
		Rectangle.clear();
		if (Rectangle.isEmpty()) {
			System.out.print("Rectangle Set is empty.");
		}
	    else {
			System.out.println("Rectangle Set size: " + Rectangle.size());
				}
			   
		
		// Displaying the Rectangle set data
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		    System.out.println();
		    System.out.println("Now the size of Rectangle set: " + Rectangle.size());
	   }
		   
}
		
	
