package commons;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

public class BagExample {
    public static void main(String[] args) {
        Bag bag = new HashBag();
        bag.add("TEST1", 100);
        bag.add("TEST2", 500);

        System.out.println("At the beginning:");
        int test1Count1 = bag.getCount("TEST1");
        int test2Count1 = bag.getCount("TEST2");
        System.out.println("Counts: \"TEST1\": " + test1Count1 + ", \"TEST2\": " + test2Count1);

        bag.remove("TEST1", 91);
        bag.remove("TEST2", 490);

        System.out.println("\nAfter removal:");
        int test1Count2 = bag.getCount("TEST1");
        int test2Count2 = bag.getCount("TEST2");
        System.out.println("Counts: \"TEST1\": " + test1Count2 + ", \"TEST2\": " + test2Count2);

        System.out.println("\nAll objects in bag:");
        for (Object o : bag) {
            System.out.println(o);
        }
    }
}
