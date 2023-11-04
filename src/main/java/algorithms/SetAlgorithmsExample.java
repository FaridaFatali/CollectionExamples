package algorithms;

import util.CollectionUtil;
import java.util.*;

public class SetAlgorithmsExample {
    public static void main(String[] args) {
        singleton();
    }

    private static void singleton() {
        System.out.println("Singleton and immutable set.");
        Set singletonImmutableSet = Collections.singleton("Java");
        CollectionUtil.listElements(singletonImmutableSet);
        singletonImmutableSet.add("C++");  // We get UnsupportedOperationException here
    }
}
