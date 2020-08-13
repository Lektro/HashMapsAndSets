package be.vdab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21_9 {

    // class to put States mapped to Capitals
    public static class MappingStatesToCapitols {
        private static String fillHashMap(){
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("Alabama", "Montgomery");
            return String.valueOf(hashMap);
        }
    }

    public static class AskUserPrompt {
        private static String userInputState() {
            System.out.println("Enter a valid USA State: ");
            Scanner sc = new Scanner(System.in);
            String userInputState = sc.nextLine();
            return userInputState;
        }
    }

    public static void main(String[] args) {
        //System.out.println(MappingStatesToCapitols.fillHashMap());
        AskUserPrompt.userInputState();
        System.out.println();
    }

}
