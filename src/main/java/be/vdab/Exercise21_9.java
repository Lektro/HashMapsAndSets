package be.vdab;

import java.util.HashMap;
import java.util.Map;

public class Exercise21_9 {

    // class to put States mapped to Capitals
    public static class MappingStatesToCapitols {
        private static String fillHashMap(){
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("Alabama", "Montgomery");
            return String.valueOf(hashMap);
        }

    }

    public static void main(String[] args) {
        System.out.println(MappingStatesToCapitols.fillHashMap());

    }

}
