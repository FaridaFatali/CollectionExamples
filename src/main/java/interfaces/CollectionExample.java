package interfaces;

import util.CollectionUtil;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection coll = CollectionUtil.getCollection();

        System.out.println("Elements in collection:");
        for (Object o : coll) {
            System.out.println(o);
        }

        System.out.println("Size of collection: " + coll.size());

        System.out.println("\nElements in collection:");
        coll.forEach(System.out::println);

        boolean b = coll.add("ten");
        System.out.println("\nIs \"ten\" adding successfully? - " + b);

        System.out.println("\nElements in collection:");
        coll.forEach(System.out::println);

        Collection coll2 = CollectionUtil.getAnotherCollection();
        b = coll.add(coll2);
        System.out.println("\nIs another collection adding successfully? - " + b);

        System.out.println("\nElements in collection:");
        coll.forEach(System.out::println);

        b = coll.remove("one");
        System.out.println("\nIs \"one\" removing successfully? - " + b);

        System.out.println("\nElements in collection:");
        coll.forEach(System.out::println);

        b = coll.removeIf(e -> e.equals("two"));
        System.out.println("\nIs \"two\" removing successfully? - " + b);

        System.out.println("\nElements in collection after removing \"two\":");
        coll.forEach(System.out::println);

        System.out.println("\nDoes the collection contain \"one\"? - " + coll.contains("one"));
        System.out.println("Does the collection contain \"four\"? - " + coll.contains("four"));
        System.out.println("Does the collection contain another collection? - " + coll.contains(coll2));

        System.out.println("\nElements in array:");
        Object[] array = coll.toArray();
        for (Object o : array) {
            System.out.println(o);
        }

        System.out.println("\nElements in collection 2:");
        coll2.forEach(System.out::println);

        b = coll.remove(coll2);
        System.out.println("\nIs removing all collection successfully? - " + b);
        System.out.println("\nElements in collection after removing a collection:");
        coll.forEach(System.out::println);

        coll.clear();

        System.out.println("\nElements in collection after clearing.");
        coll.forEach(System.out::println);
    }
}
