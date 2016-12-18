
public class TreeMap {
	 public static void main(String args[]) {
	  
		 
		 // Create a hash map
	      TreeMap Rectangle = new TreeMap();
	      
	      // Put elements to the map
	      Rectangle.put("josh", new Double(3434.34));
	      Rectangle.put("Mahnaz", new Double(123.22));
	      Rectangle.put("Ayan", new Double(1378.00));
	      Rectangle.put("Daisy", new Double(99.22));
	      Rectangle.put("Qadir", new Double(-19.08));
	      
	      // Get a set of the entries
	      Set set = Rectangle.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      
	      // Deposit 100 into Zara's account
	      double balance = ((Double)Rectangle.get("josh")).doubleValue();
	      Rectangle.put("josh", new Double(balance + 100));
	      System.out.println("josh's new balance: " + Rectangle.get("josh"));
	   }
	}
}
