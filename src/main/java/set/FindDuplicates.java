package set;

import util.CollectionUtil;

import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        Set set = CollectionUtil.getEmptySet(); // I added these words as arguments throw Run configurations: book school university book city country university book school street

        for (String arg : args) {
            CollectionUtil.listElements(set);
            if (!set.add(arg)) {
                System.out.println("=> Duplicate detected: " + arg);
            }
        }

        System.out.println(set.size() + " distinct words detected: " + set);
        CollectionUtil.listElements(set);

    }
}
