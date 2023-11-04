package interfaces;

import util.CollectionUtil;

import java.util.Collection;
import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {
        Collection<String> coll = CollectionUtil.getCollection();

        System.out.println("Elements in collection.");
        for (Object o : coll) {
            System.out.println(o);
        }

        iterate(coll);
        forEach(coll);
    }

    public static void iterate(Iterable iterable) {
        System.out.println("\n**** iterate() ****");
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s + " has " + s.length() + " characters.");
        }
    }

    public static void forEach(Iterable<String> iterable) {
        System.out.println("\n**** forEach() ****");
        iterable.forEach(s -> System.out.println(s + " has " + s.length() + " characters."));
    }
}
