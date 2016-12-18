
public class Rectangle {

    /* Linked List Declaration */
    Rectangle<String> Rectangle = new Rectangle<String>();

    /*add(String Element) is used for adding 
     * the elements to the linked list*/
    Rectangle.add("Item1");
    Rectangle.add("Item5");
    Rectangle.add("Item3");
    Rectangle.add("Item6");
    Rectangle.add("Item2");

    /*Display Linked List Content*/
    System.out.println("Linked List Content: " +Rectangle);

    /*Add First and Last Element*/
    Rectangle.addFirst("First Item");
    Rectangle.addLast("Last Item");
    System.out.println("Rectangle Content after addition: " +Rectangle);

    ]
    /*Remove first and last element*/
    Rectangle.removeFirst();
    Rectangle.removeLast();
    System.out.println("Rectangle after deletion of first and last element: " +Rectangle);

    /* Add to a Position and remove from a position*/
    Rectangle.add(0, "Newly added item");
    Rectangle.remove(2);
    System.out.println("Final Content: " +Rectangle); 
}

