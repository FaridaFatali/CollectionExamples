package commons;

import java.util.function.BiConsumer;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;

public class BidirectionalMap {
    public static void main(String[] args) {
        BidiMap names = new TreeBidiMap();
        names.put("c", "Cihan");
        names.put("k", "Kemal");
        names.put("b", "Betul");
        names.put("k", "Cihan");
        names.put("a", "Ali");

        System.out.println("\nNames:");
        BiConsumer biConsumer = (k, v) -> System.out.println(k + " -> " + v);
        names.forEach(biConsumer);

        System.out.println("\nValue for key k: " + names.get("k"));
        System.out.println("Key for value \"Cihan\": " + names.getKey("Cihan"));
    }
}
