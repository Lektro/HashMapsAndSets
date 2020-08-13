package be.vdab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise21_1 {
    public static void main(String[] args) {
        String[] keywordString1 = {"Chemistry", "Mathematics", "Biology", "English"};
        String[] keywordString2 = {"Biology", "English", "Geography", "Physics"};

        Set<String> keywordSet1 = new HashSet<>(Arrays.asList(keywordString1));
        Set<String> keywordSet2 = new HashSet<>(Arrays.asList(keywordString2));

        System.out.println(keywordSet1.containsAll(keywordSet2));
    }
}
