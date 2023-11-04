package algorithms;

import domain.Name;
import java.util.*;

public class SearchingExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        Name name1 = new Name("David", "David");
        list.add(name1);
        Name name2 = new Name("Angelina", "Angelina");
        list.add(name2);
        Name name3 = new Name("Raul", "Raul");
        list.add(name3);
        Name name4 = new Name("Ralph", "Ralph");
        list.add(name4);
        Name name5 = new Name("Joseph", "Joseph");
        list.add(name5);
        Name name6 = new Name("Maria", "Maria");
        list.add(name6);
        Name name7 = new Name("Jessica", "Jessica");
        list.add(name7);
        Name name8 = new Name("Dan", "Dan");
        list.add(name8);
        Name name9 = new Name("Jennifer", "Jennifer");
        list.add(name9);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Name searchFor = new Name("Raul", "Raul");

        int index = Collections.binarySearch(list, searchFor);
        System.out.println("\nIndex: " + index);
        System.out.println("\nIndex is: " + index + " for the search: " + list.get(index));
    }
}
