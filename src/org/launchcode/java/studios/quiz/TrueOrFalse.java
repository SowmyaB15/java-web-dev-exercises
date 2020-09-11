package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, ArrayList<String> options) {
        super(question, options);
    }

    @Override
    public boolean isCorrect(String userResponse) {
        return userResponse.equalsIgnoreCase(this.getCorrectAnswer());
    }

}
