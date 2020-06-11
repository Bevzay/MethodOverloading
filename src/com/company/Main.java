package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score +" points");
        return score * 1000;
    }

    // method overloading
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // 2nd method overloading
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
