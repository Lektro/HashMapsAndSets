package be.vdab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise21_4 {
    // variables
    private static int vowelsA = 0;
    private static int vowelsE = 0;
    private static int vowelsI = 0;
    private static int vowelsO = 0;
    private static int vowelsU = 0;

   // method to count vowels and consonants
    public static void countVowelsAndConsonants(String str) {

        // check if string is not empty
        if (str == null) {
            // or throw IllegalArgumentException
            throw new IllegalArgumentException("Input String can't be null");
        }

        str = str.toLowerCase();

        // for loop to go through the word letter for letter, switch case to keep track of vowel counts
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case 'a':
                    vowelsA++;
            }
            switch (ch) {
                case 'e':
                    vowelsE++;
            }
            switch (ch) {
                case 'i':
                    vowelsI++;
            }
            switch (ch) {
                case 'o':
                    vowelsO++;
            }
            switch (ch) {
                case 'u':
                    vowelsU++;
            }
        }
    }

    // Main
    public static void main(String[] args) throws IOException {

        // variable's to read the input file"
        FileReader reader = null;
        String line = null;

        // put text file into new array list
        ArrayList<String> list = new ArrayList<>();
        try {
            reader = new FileReader("testCollection.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // buffers the input file in case it's very large
        BufferedReader bf = new BufferedReader(reader);
        while ((line = bf.readLine()) != null) {
            list.add(bf.readLine());
        }

        // printing the ArrayList and total count of vowels
        System.out.println("Input Text: " + list);
        countVowelsAndConsonants(list.toString());
        System.out.println("Amount of A's: " + vowelsA);
        System.out.println("Amount of E's: " + vowelsE);
        System.out.println("Amount of I's: " + vowelsI);
        System.out.println("Amount of O's: " + vowelsO);
        System.out.println("Amount of U's: " + vowelsU);
    }
}
