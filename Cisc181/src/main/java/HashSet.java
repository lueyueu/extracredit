
import java.util.HashSet;

public class HashSet {

	
	
	
	   public static void main(String args[]) {
		   HashSet Rectangle = new HashSet();
		    Rectangle.add( new Integer( 6 ) );
		    Rectangle.add( new Integer( 1 ) );
		    Rectangle.add( new Integer( 4 ) );
		    System.out.println( Rectangle );
		    System.out.println();
		    System.out.println("Hashset is this size: " + Rectangle.size());
		    

		    System.out.println( "Rectangle.count( dog ) = " + Rectangle.count( 4 ) );
		    HashSetIterator i = Rectangle.find( 4 );
		    if ( i.equals( Rectangle.end() ) ) 
		      System.out.println( "Could not find 4." );
		    else
		      System.out.println( "Found " + i.get() );
		    System.out.println( "Rectangle.remove( 4 ) = " + Rectangle.remove( 4 ) );
		    HashSetIterator j = Rectangle.find( 4 );
		    if ( j.atEnd() ) 
		      System.out.println( "Could not find 4." );
		    else
		      System.out.println( "Found " + j.get() );
		    }
		  

	   }