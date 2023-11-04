package algorithms;

import java.util.*;

public class ShuffleExample1 {
    public static void main(String[] args) {
        List list = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        System.out.println("List before shuffle is:\n" + list);  // With normal ordering
        System.out.println();

        Collections.shuffle(list);
        System.out.println("Shuffled list is:\n" + list);  // It shuffles the elements
        System.out.println();

        Collections.sort(list);
        System.out.println("Sorted list:\n" + list);  // It sorts again
        System.out.println();

        Collections.reverse(list);
        System.out.println("Reversed list:\n" + list);  // It reversed the elements from end to the beginning
        System.out.println();

        Collections.sort(list);
        System.out.println("Sorted list:\n" + list);  // Sorts again
        System.out.println();

        Collections.swap(list, 0, 19);
        System.out.println("Swapped list:\n" + list);  // It changes places of the 1st and the last elements
        System.out.println();

        Collections.sort(list);
        System.out.println("Sorted list:\n" + list); // It sorts again
        System.out.println();

        System.out.println(Collections.binarySearch(list, -9));  // It returns -1 because this element -9 doesn't exist

        System.out.println();
        Collections.rotate(list, 3);
        System.out.println("Rotated list:\n" + list);  // It rotates the last 3 elements
    }
}
