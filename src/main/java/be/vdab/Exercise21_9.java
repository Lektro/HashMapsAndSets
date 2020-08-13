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

            // check if hashmap is filled or not
            if(hashMap != null && !hashMap.isEmpty()){

                // set keys in hashmap
                for(String key : hashMap.keySet()){

                    // print out each key set
                    System.out.println(key+":"+hashMap.get(key));
                }
            }
            
            return String.valueOf(hashMap);
        }
    }

    // Ask Prompt to user and try to compare to hashmap
    public static class AskUserPrompt {
        private static String userInputState() {
            System.out.println("Enter a valid USA State: ");
            Scanner input = new Scanner(System.in);
            String userInputState = input.nextLine();

            return userInputState;
        }
    }

    public static void main(String[] args) {
        MappingStatesToCapitols.fillHashMap();
        //AskUserPrompt.userInputState();
        //System.out.println();
    }

}
