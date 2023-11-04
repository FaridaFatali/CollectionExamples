package set;

import java.util.*;
import util.CollectionUtil;
import java.util.function.Predicate;

public class SetExample {
    public static void main(String[] args) {
//        processSet();
//        processUnmodifiableSet();
//        addSetToSet();
//        addCollectionToSet();
    }

    public static void processSet() {
        Set set = CollectionUtil.getEmptySet();
        System.out.println(set.add(5));
        System.out.println(set.add("Country"));
        System.out.println(set.add(5));  // false
        System.out.println(set.add("City"));
        System.out.println(set.add("Street"));
        System.out.println(set.add(new Date()));

        System.out.println("Contains Country? - " + set.contains("Country"));

        set.add("Avenue");

        System.out.println("\nIterating the list through an iterator:");
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println();

        System.out.println("\nIterating forward through forEach:");
        set.forEach(System.out::println);

        System.out.println("\nListing the set:");
        Predicate<Object> stringPredicate = s -> s instanceof String;
        set.forEach(System.out::println);
        System.out.println("\nFiltering the set:");
        set.removeIf(stringPredicate);
        set.forEach(System.out::println);

        System.out.println("\nAdding null to set:");
        System.out.println(set.add(null));
        System.out.println(set.add(null)); // We can't add this twice
    }

    public static void processUnmodifiableSet() {
        Set<String> set = Set.of("Home", "House", "Building", "Apartment");
        set.forEach(System.out::println);

//        set.remove("Home");  // UnsupportedOperationException - we can't change it

//        Set<String> set2 = Set.of("Home", "House", "Building", null);   // NullPointerException - we can't add null
//        set2.forEach(System.out::println);
    }

    public static void addSetToSet() {
        Set set1 = CollectionUtil.getEmptySet();
        set1.add(5);
        set1.add("Country");
        set1.add(5);
        set1.add("City");
        set1.add("Street");
        set1.add(new Date());

        Set set2 = CollectionUtil.getEmptySet();
        set2.add(7);
        set2.add("Village");
        set2.add(5);
        set2.add("City");
        set2.add("Street");
        set2.add(new Date());

        System.out.println("\nAdding set2 to the set1:");
        System.out.println("Adding throw add() for the 1st time: " + set1.add(set2)); // add() method ads the collection completely
        System.out.println("Adding throw add() for the 2nd time: " + set1.add(set2)); // We can't add twice

        System.out.println("\nAdding throw addAll() for the 1st time: " + set1.addAll(set2));  // addAll() method adds all elements one by one if they don't exist in set1
        System.out.println("Adding throw addAll() for the 2nd time: " + set1.addAll(set2));

        System.out.println("\nSet:");
        set1.forEach(System.out::println);
    }

    public static void addCollectionToSet() {
        Set set = new HashSet();
        set.add(5);
        set.add("Country");
        set.add(5);
        set.add("City");
        set.add("Street");
        set.add(new Date());

        Collection coll = CollectionUtil.getCollectionWithDuplicates();
        System.out.println("\nCollection with duplicated items:");
        coll.forEach(System.out::println);

        System.out.println("\nAdding collection with duplicated items to the set:");
        System.out.println(set.addAll(coll));  // to add all elements of the collection
        System.out.println(set.add(coll));     // to add the whole collection

        System.out.println("\nSet:");
        set.forEach(System.out::println);
    }
}
