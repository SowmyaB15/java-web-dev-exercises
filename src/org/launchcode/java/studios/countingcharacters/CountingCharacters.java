package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString = input.next();

        HashMap<Character, Integer> result = new HashMap<>();
        result = characterCount(inputString);

        for (Map.Entry<Character, Integer> character : result.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

    public static HashMap<Character, Integer> characterCount(String myString) {

        HashMap<Character, Integer> counts = new HashMap<>();

        char[] charactersInString = myString.toLowerCase().toCharArray();

        for(char letter : charactersInString) {
            if (letter >= 'a' && letter <= 'z') { // ascii values -- to count only alphabets(lower case since its converted to lowercase)
                if (counts.containsKey(letter)) {
                    // If char is present, increment it's count by 1
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    // If char is not present, putting this char to result with 1 as it's value
                    counts.put(letter, 1);
                }
            }
        }
        return counts;
    }

}