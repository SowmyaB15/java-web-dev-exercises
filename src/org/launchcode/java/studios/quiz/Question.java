package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public abstract class Question {

    private String prompt;
    private ArrayList<String> options; // options => multiple choices, true/false, checkbox choices
    private String correctAnswer;

    public Question(String prompt, ArrayList<String> options) {
        this.prompt = prompt;
        this.options = options;
    }

    public abstract boolean isCorrect(String answer);

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void addOptions(String answerOptions) {
        this.options.add(answerOptions);
    }

    public void displayPromptAndOptions() {
        System.out.println("Question: " + prompt);
        System.out.println("Your Options: ");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i));
        }
    }

}
