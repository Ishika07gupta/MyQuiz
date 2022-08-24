package com.example.myquiz;

public class Question {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    int correctAns;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, int correctAns) {
        this.question=question;
        this.optionA=optionA;
        this.optionB=optionB;
        this.optionC=optionC;
        this.optionD=optionD;
        this.correctAns=correctAns;
    }


    public String getquestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getoptionA() {
        return optionA;
    }

    public void setoptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getoptionB() {
        return optionB;
    }

    public void setoptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getoptionC() {
        return optionC;
    }

    public void setoptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getoptionD() {
        return optionD;
    }

    public void setoptionD(String optionD) {
        this.optionD = optionD;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
