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

        // Check if an element is present in both strings then removing an entry in set one if its found in set two
        Set one = new HashSet<>(keywordSet1);
        Set two = new HashSet<>(keywordSet2);
        one.removeAll(keywordSet2);
        two.removeAll(keywordSet1);

        // Prints out the words only found in set 1
        System.out.println(one + ": only present in HashSet 1.");

        // Check if an element is present in both strings then removing an entry in set four if its found in set three
        Set three = new HashSet<>(keywordSet1);
        Set four = new HashSet<>(keywordSet2);
        three.removeAll(keywordSet2);
        four.removeAll(keywordSet1);

        // Prints out the words only found in set 2
        System.out.println(four + ": only present in HashSet 2.");

        // check if an element is present in both strings
        for (final String element2 : keywordSet1) {

            // if second set has the current element
            if (keywordSet2.contains(element2)) {
                System.out.println(element2 + ": present in both HashSets.");
            }
        }
    }
}
