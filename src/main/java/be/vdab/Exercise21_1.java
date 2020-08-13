package be.vdab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise21_1 {
    public static void main(String[] args) {

        // String Array
        String[] keywordString1 = {"Chemistry", "Mathematics", "Biology", "English"};
        String[] keywordString2 = {"Biology", "English", "Geography", "Physics"};

        // Puts the String Arrays into Hashsets
        Set<String> keywordSet1 = new HashSet<>(Arrays.asList(keywordString1));
        Set<String> keywordSet2 = new HashSet<>(Arrays.asList(keywordString2));

        // Created new HashSets to deduct value's if equal
        Set one = new HashSet<>(keywordSet1);
        one.removeAll(keywordSet2);
        // Prints out the words only found in set 1
        System.out.println(one + ": only present in HashSet 1.");

        // Created new HashSets to deduct value's if equal
        Set four = new HashSet<>(keywordSet2);
        four.removeAll(keywordSet1);
        // Prints out the words only found in set 2
        System.out.println(four + ": only present in HashSet 2.");

        // check if an element is present in both strings
        for (final String element : keywordSet1) {
            // if second set has the current element
            if (keywordSet2.contains(element)) {
                System.out.println(element + ": present in both HashSets.");
            }
        }
    }
}
