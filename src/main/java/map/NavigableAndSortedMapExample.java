package map;

import util.CollectionUtil;
import java.util.*;

public class NavigableAndSortedMapExample {
    public static void main(String[] args) {
        Map map = new TreeMap();
        System.out.println(map.put(1, "i"));
        System.out.println(map.put(2, "d"));
        System.out.println(map.put(3, "x"));
        System.out.println(map.put(4, "u"));
        System.out.println(map.put(5, "x"));
        System.out.println(map.put(6, "a"));
        System.out.println(map.put(7, "a"));

        CollectionUtil.listElements(map);

        sortedMapProperties((SortedMap) map);
        navigableMapProperties((NavigableMap) map);
    }

    public static void sortedMapProperties(SortedMap sortedMap) {
        System.out.println("\nSortedSet Interface Functionalities");
        System.out.println("First key: " + sortedMap.firstKey());
        System.out.println("Last key: " + sortedMap.lastKey());

        Comparator comparator = sortedMap.comparator();
        if (comparator != null) {
            System.out.println(comparator.getClass().getName());
        } else {
            System.out.println("Comparator is null");
        }

        SortedMap subMap = sortedMap.subMap(3, 6);
        System.out.println("Sub map:");                    // Gives sub map (elements) from 3 (inclusive) to 6 (exclusive) - 3, 4, 5
        CollectionUtil.listElements(subMap);

        SortedMap headMap = sortedMap.headMap(3);
        System.out.println("Head map:");                   // Gives head map (elements) to 3 (exclusive) - 1 and 2
        CollectionUtil.listElements(headMap);

        SortedMap tailMap = sortedMap.tailMap(3);
        System.out.println("\nTail map:");                 // Gives tail map (elements) from 3 (inclusive) to the end - 3, 4, 5, 6, 7
        CollectionUtil.listElements(tailMap);
    }

    public static void navigableMapProperties(NavigableMap navigableMap) {
        System.out.println("\nNavigableMap Interface Functionalities:");
        System.out.printf("First entry: %s%n", navigableMap.firstEntry());   // Gives the 1st element
        System.out.printf("Last entry: %s%n", navigableMap.lastEntry());     // Gives the last element
        System.out.printf("Head map to key 4 : %s%n", navigableMap.headMap(4));    // From 1 to 4 (exclusive) - 1, 2, 3
        System.out.printf("Head map to key 4 including 4 : %s%n", navigableMap.headMap(4, true));  // From 1 to 4 (inclusive) - 1, 2, 3, 4
        System.out.printf("Head map to key 4 excluding 4 : %s%n", navigableMap.headMap(4, false)); // From 1 to 4 (exclusive) - 1, 2, 3
        System.out.printf("Tail map greater than or equal to key 5 : %s%n", navigableMap.tailMap(5));    // From 5 (inclusive) to the last - 5, 6, 7
        System.out.printf("Tail map greater than or equal to key 5 including 5: %s%n", navigableMap.tailMap(5, true)); // From 5 (inclusive) - 5, 6, 7
        System.out.printf("Tail map greater than or equal to key 5 excluding 5: %s%n", navigableMap.tailMap(5, false)); // From 5 (exclusive) - 6, 7
        System.out.printf("Map entry with the least key higher than 4 : %s%n", navigableMap.higherEntry(4));  // The least key higher than 4 is 5
        System.out.printf("Map entry with greatest key lower than 4 : %s%n", navigableMap.lowerEntry(4));     // The greatest key lower than 4 is 3
        System.out.printf("Map entry with least element greater than or equal to \"h\" : %s%n", navigableMap.floorKey(4));  // It's 4, if we remove key "4" (line 12) we'll get 3 (lower than 4)
        System.out.printf("Least key greater than or equal to key 4 : %s%n", navigableMap.ceilingKey(4));  // It's 4
        System.out.printf("Descending key set : %s%n", navigableMap.descendingKeySet());  // From the last to the 1st element
    }
}
