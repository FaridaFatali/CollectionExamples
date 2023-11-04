package set;

import java.util.*;

public class SetPerformance {
    private static int n = 10_000_000;
    private static Random random = new Random();

    public static void main(String[] args) {
        hashSetInsertion();
        treeSetInsertion();
    }

    public static void hashSetInsertion() {
        Set<Integer> set = new HashSet<>(n);
        double start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            set.add(i);
//            set.add(random.nextInt());  // It works slowly with random
        }

        double end = System.currentTimeMillis();
        System.out.println("Time to insert into HashSet: " + (end - start));
    }

    public static void treeSetInsertion() {
        Set<Integer> set = new TreeSet<>();
        double start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            set.add(i);
//            set.add(random.nextInt());  // It works slowly with random
        }

        double end = System.currentTimeMillis();
        System.out.println("Time to insert into TreeSet: " + (end - start));
    }
}
