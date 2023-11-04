package map;

import java.util.Map;
import java.util.Set;
import util.CollectionUtil;
import java.util.Comparator;

public class MapEntryExample {
    public static void main(String[] args) {
        Map map = CollectionUtil.getMap();

        System.out.println("*** Entry set ***");
        Set entrySet = map.entrySet();
        entrySet.forEach(System.out::println);

        System.out.println("\n*** Processing map entries ***");

        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println();

        Comparator<Map.Entry<String, Integer>> keyComparator = Map.Entry.comparingByKey();
        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        Map.Entry entryForAKeyAndValue1 = Map.entry("x", 100);
        Map.Entry entryForAKeyAndValue2 = Map.entry("x", 100);
        Map.Entry entryForAKeyAndValue3 = Map.entry("y", 1000);
        Map.Entry entryForAKeyAndValue4 = Map.entry("five", 15);

        System.out.println("\nComparing entryForAKeyAndValue1 and entryForAKeyAndValue2: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue2));
        System.out.println("Comparing entryForAKeyAndValue1 and entryForAKeyAndValue3: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue3));
        System.out.println("Comparing entryForAKeyAndValue3 and entryForAKeyAndValue4: " + keyComparator.compare(entryForAKeyAndValue3, entryForAKeyAndValue4));

        System.out.println("\nComparing entryForAKeyAndValue1 and entryForAKeyAndValue2: " + valueComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue2));
        System.out.println("Comparing entryForAKeyAndValue1 and entryForAKeyAndValue3: " + valueComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue3));
        System.out.println("Comparing entryForAKeyAndValue3 and entryForAKeyAndValue4: " + valueComparator.compare(entryForAKeyAndValue3, entryForAKeyAndValue4));

//        Map.Entry.comparingByKey();
    }
}
