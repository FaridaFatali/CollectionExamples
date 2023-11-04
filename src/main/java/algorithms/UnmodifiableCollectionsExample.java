package algorithms;

import util.CollectionUtil;
import java.util.*;

public class UnmodifiableCollectionsExample {
    public static void main(String[] args) {
        Collection coll = CollectionUtil.getCollection();
        System.out.println(coll);
        coll.add("fifteen");
        System.out.println(coll);

        Collection unmodifiableCollection = Collections.unmodifiableCollection(coll);
        CollectionUtil.listElements(unmodifiableCollection);
//        unmodifiableCollection.add("twenty");  // We get UnsupportedOperationException here

        Set unmodifiableSet = Collections.unmodifiableSet(CollectionUtil.getSet());
        CollectionUtil.listElements(unmodifiableCollection);
//        unmodifiableSet.add("5");  // We get UnsupportedOperationException here

        List unmodifiableList = Collections.unmodifiableList(CollectionUtil.getStringList());
        CollectionUtil.listElements(unmodifiableList);
//        unmodifiableList.add("5");  // We get UnsupportedOperationException here
    }
}
