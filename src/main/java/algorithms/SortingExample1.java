package algorithms;

import domain.Name;
import java.util.*;

public class SortingExample1 {
    public static void main(String[] args) {
        List<Name> list = new ArrayList<>();

        Name name1 = new Name("David", "David");
        list.add(name1);
        Name name2 = new Name("Angelina", "Angelina");
        list.add(name2);
        Name name3 = new Name("Michael", "Michael");
        list.add(name3);
        Name name4 = new Name("Tailor", "Tailor");
        list.add(name4);
        Name name5 = new Name("Enrique", "Enrique");
        list.add(name5);

        System.out.println("Unsorted list is:\n" + list);
        Collections.sort(list);
        System.out.println("\nSorted list is:\n" + list);
    }
}
