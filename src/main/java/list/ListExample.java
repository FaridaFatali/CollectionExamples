package list;

import java.util.*;
import util.CollectionUtil;
import java.util.function.*;

public class ListExample {
    public static void main(String[] args) {
        processList();
        System.out.println();
        iterateList();
        System.out.println();
        processUnmodifiableList();
        System.out.println();
        listFromArray();
    }

    public static void processList() {
        System.out.println("*** processList() ***");
        List list = CollectionUtil.getList();

        System.out.println("\nList elements:");
        list.forEach(System.out::println);

        list.add("End");
        list.add(0, "Start");

        System.out.println("\nList elements:");
        list.forEach(System.out::println);

        System.out.println();

        System.out.println("Is \"Jennifer\" in this list? - " + list.contains("Jennifer"));
        System.out.println("3rd element: " + list.get(3));
        System.out.println("Index of 3: " + list.indexOf(3));
        System.out.println("Last index of 3: " + list.lastIndexOf(3));

        System.out.println("\nSub 2nd element: " + list.set(2, "Amanda"));
        System.out.println("Is \"Jennifer\" in the list? - " + list.contains("Jennifer"));

        System.out.println("\nSub list between 1 (inclusive) and 3 (exclusive)");

        List subList = list.subList(1, 3);
        subList.forEach(System.out::println);

        System.out.println("\nA string list:");
        List<String> stringList = CollectionUtil.getStringList();
        stringList.forEach(System.out::println);

        System.out.println("\nSorting string list:");
        Comparator<String> stringComparator = Comparator.comparingInt(String::length);
        stringList.sort(stringComparator);
        stringList.forEach(System.out::println);

        System.out.println("\nProcessing a string list with a unary operation:");
        UnaryOperator<String> operator = s -> s.toUpperCase();
        stringList.replaceAll(operator);
        stringList.forEach(System.out::println);

        System.out.println("\nProcessing a string list with a predicate:");
        Predicate<String> stringLengthPredicate = s -> s.length() > 3;
        stringList.removeIf(stringLengthPredicate);
        stringList.forEach(System.out::println);
    }

    public static void iterateList() {
        System.out.println("*** iterateList() ***");

        List list = CollectionUtil.getList();
        System.out.println("\nIterating the list through a for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("\nIterating the list through an iterator:");
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\nIterating forward through forEach:");
        list.forEach(System.out::println);

        System.out.println("\nIterating forward through a list iterator:");
        ListIterator listIter = list.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.nextIndex() + ": " + listIter.next());
        }

        System.out.println("\nIterating backward through a list iterator:");
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previousIndex() + ": " + listIter.previous());
        }

        System.out.println("\nProcessing the list iterating forward through a list iterator:");
        listIter = list.listIterator();
        listIter.add("1");
        while (listIter.hasNext()) {
            listIter.add("* * *");
            if (listIter.next().equals("Jennifer")) {
                listIter.set("Johanna");
            }
        }
        listIter.add("* * *");
        listIter.add("22");
        list.forEach(System.out::println);
    }

    public static void processUnmodifiableList() {
        System.out.println("*** processUnmodifiableList() ***");
        List<String> list = List.of("David", "Jon", "Daniel", "Angelina");
        list.forEach(System.out::println);

//        list.set(0, "Malena");  // UnsupportedOperationException

//        List<String> list1 = List.of("Jon", "Daniel", "Angelina", null);  // NullPointerException
    }

    public static void listFromArray() {
        System.out.println("*** listFromArray() ***");
        String [] array = new String[] {"Hit List", "To Do List", "Mailing List", "Price List", "Top Ten List"};

        List list = Arrays.asList(array);
        System.out.println("List");
        list.forEach(System.out::println);

//        list.add("Last List");  // Run time error: UnsupportedOperationException

        list.set(0, "Black List");
        System.out.println("\nList:");
        list.forEach(System.out::println);

        System.out.println("\nArray:");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
