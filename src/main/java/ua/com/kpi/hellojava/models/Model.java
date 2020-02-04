package ua.com.kpi.hellojava.models;

public class Model {

    private String firstWord;
    private String secondWord;

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public String buildMessage() {
        return String.format("%s %s", firstWord, secondWord);
    }
}
