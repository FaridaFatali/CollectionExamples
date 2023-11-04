package algorithms;

import java.util.*;

public class ListAlgorithmsExample {
    public static void main(String[] args) {
        fill();
        copy();
        singleton();
    }

    public static void fill() {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println("\nList:");
        list.forEach(System.out::println);

        Collections.fill(list, "Java");  // It fills the list with "Java"

        System.out.println("\nList:");
        list.forEach(System.out::println);
    }

    public static void copy() {
        System.out.println("\n\nAn immutable list with n copies of an object:");
        List immutableList = Collections.nCopies(10, "Java");
        immutableList.forEach(System.out::println);
//        immutableList.add("C++");  // UnsupportedOperationException
    }

    private static void singleton() {
        System.out.println("\n\nSingleton and immutable list:");
        List singletonImmutableList = Collections.singletonList("Java");
        singletonImmutableList.forEach(System.out::println);
//        singletonImmutableList.add("C++"); // UnsupportedOperationException
    }
}
