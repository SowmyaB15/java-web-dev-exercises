package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> someInts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someInts.add(i); // 0,1,2,3,4,5,6,7,8,9
        }
        int sum = sumOfEvenNumbers(someInts);
        System.out.println("Sum of even numbers: " + sum);

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("Hello");
        someWords.add("Hi");
        someWords.add("Launch");
        someWords.add("Coder");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word: ");
        int size = input.nextInt();
        ArrayList<String> returnCustomList = customLetterWords(someWords, size);

//        String[] array = new String[someFiveLetterList.size()];
//        array = someFiveLetterList.toArray(array);
//
//        for (String word : array) {
//            System.out.println(word);
//        }
//        System.out.println(returnCustomList);
        for (String word : returnCustomList) {
            System.out.println(word);
        }
    }

    public static int sumOfEvenNumbers(ArrayList<Integer> someArray) {
        int sum = 0;
        for (int num : someArray) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static ArrayList<String> customLetterWords(ArrayList<String> someList, int wordLength) {
        ArrayList<String> customLetterList = new ArrayList<>();
        for (String word : someList) {
            if (word.length() == wordLength) {
                customLetterList.add(word);
            }
        }
        return customLetterList;
    }

}
