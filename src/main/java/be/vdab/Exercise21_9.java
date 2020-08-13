package be.vdab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_9 {

    // class to put States mapped to Capitals
    public static class MappingStatesToCapitols {

        private static String fillHashMap(){
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("Alabama", "Montgomery");

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + hashMap);


            Set<String> keys = hashMap.keySet();

            // check if hashmap is filled or not
            if(hashMap != null && !hashMap.isEmpty()){
                // set keys in hashmap
                for(String key : hashMap.keySet()){
                    // print out each key set
                    System.out.println("Key Mappings are: " + key + ":" + hashMap.get(key));
                }
                if (hashMap.containsKey(userInputState)){
                    System.out.println("Capitol belonging to this State is: " + key);
                } else {
                    System.out.println("No Match found, please try again. ");
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


    }
}
