package org.launchcode.java.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        System.out.println("Enter the search term");
        String searchTerm = input.nextLine();
        System.out.println("Search term present: " + sentence.toLowerCase().contains(searchTerm));
        System.out.println("Index of search term: " + sentence.toLowerCase().indexOf(searchTerm));
        System.out.println("Length of search term: " + searchTerm.length());
        System.out.println("Sentence after removing search term: " + sentence.toLowerCase().replaceAll(searchTerm, ""));
    }
}
