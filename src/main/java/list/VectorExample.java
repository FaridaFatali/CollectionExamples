package list;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector vector = new Vector();

        System.out.println("Adding to the vector:");
        System.out.println(vector.add(1));
        System.out.println(vector.add(10));
        System.out.println(vector.add(100));
        System.out.println(vector.add(1000));

        System.out.println("\nAt the beginning:");
        System.out.println("Empty? - " + vector.isEmpty());
        System.out.println("Size: " + vector.size());

        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        System.out.println("\nElements with Enumeration:");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            int i = (int) enumeration.nextElement();
            System.out.println(i);
        }

        System.out.println("\nElements with Iterator:");
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            int i = (int) it.next();
            System.out.println(i);
        }

        System.out.println("\nElements with forEach:");
        vector.forEach(System.out::println);
    }
}
