
public class HashMap {
	Map<String, Integer> Rectangle = new TreeMap<String, Integer>();
	
	
	// Put elements to the map
	Rectangle.put("A", new Double(21.25));
	Rectangle.put("B", new Double(22.34));
	Rectangle.put("C", new Double(15.89));
	
	// count hashmap
	System.out.println("Count in hm: " + Rectangle.size());
	   
	String value = entry.getValue();
	   Integer count = Rectangle.get(value);
	   if (count == null){
	      Rectangle.put(value, new Integer(1));}
	   else{
	      Rectangle.put(value, new Integer(count+1));
	}

    //Remove values based on key*/
    Rectangle.remove(21.25);
    System.out.println("Map key and values after removal:");
    Set set2 = Rectangle.entrySet();
    Iterator iterator = set2.iterator();
    while(iterator.hasNext()) {
    	Map.Entry mentry2 = (Map.Entry)iterator.next();
    }
    System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
    System.out.println(mentry2.getValue());
    
    
    hSize = hMap.size();
    }
}