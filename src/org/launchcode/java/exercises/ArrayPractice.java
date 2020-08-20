package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] someInts = {1, 1, 2, 3, 5, 8};
        for (int number : someInts) {
            if (number % 2 == 1) {
                System.out.println(number); // odd numbers
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";
        String[] wordsArray = sentence.split(" "); // space delimiter
        System.out.println(Arrays.toString(wordsArray));

        String[] commaArray = sentence.split(","); // comma delimiter
        System.out.println(Arrays.toString(commaArray));
    }
}


