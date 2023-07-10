package oop_1.hw3;

public class Answer {
     Integer bull;
    Integer cow;
   static int numTry;

    public Answer(Integer bull, Integer cow, int numTry) {
        this.bull = bull;
        this.cow = cow;
        Answer.numTry = numTry;
    }

    public Answer() {
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public int getNumTry() {
        return numTry;
    }

    public void setNumTry(int numTry) {
        this.numTry = numTry;
    }

    @Override
    public String toString() {
        return "You sniped " +
                bull + " - Bulls" + " " +
                cow + " - Cows" +
                ", attempt number " + numTry;
    }
}
