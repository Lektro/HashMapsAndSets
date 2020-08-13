package be.vdab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise21_4 {
    private static int vowels = 0;
    private static int consonants = 0;

    public static void countVowelsAndConsonants(String str) {

        // check if string is not empty
        if (str == null) {
            // or throw IllegalArgumentException
            throw new IllegalArgumentException("Input String can't be null");
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        String line = null;

        ArrayList<String> list = new ArrayList<>();
        try {
            reader = new FileReader("testCollection.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(reader);

        while ((line = bf.readLine()) != null) {
            list.add(bf.readLine());
        }

        // printing the unsorted ArrayList
        System.out.println("Input Text: " + list);
        System.out.println("String.charAt() solution:");
        countVowelsAndConsonants(list.toString());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);


    }
}
