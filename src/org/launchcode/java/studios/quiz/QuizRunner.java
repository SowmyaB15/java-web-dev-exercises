package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        ArrayList<String> choices = new ArrayList<>();
        Scanner input;
        input = new Scanner(System.in);

        // set options for the question to select from
        choices.add("true");
        choices.add("false");

        TrueOrFalse q1 = new TrueOrFalse("Java is a programming language?", choices);
        q1.setCorrectAnswer("true");
        q1.displayPromptAndOptions();

        System.out.println("Enter your choice: ");
        String response = input.next();
        boolean isCorrect = q1.isCorrect(response);
        System.out.println("Is your answer correct? " + isCorrect);

    }
}
