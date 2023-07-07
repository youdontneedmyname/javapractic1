package practice;

import java.util.Scanner;

public class QuizGame {
    private static int score = 0;
    private static int lives = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        askQuestion("skolko chasov v odnoy minute", "5");
        askQuestion("skolko jeludkov u korovi", "4");
        askQuestion("kogda konckilas vtoraya mirovaya woyna", "1945");
        askQuestion("pocemu azigaga azigaga", "azigaga");
        askQuestion("skolko kg saxara v kompote", "3");
        askQuestion("skolko gb operativki u intel core i5 8th gen", "4");
        askQuestion("skolko trillionov derevyev na zemle", "3");
        askQuestion("kakoy pol komara soset krov", "jenskiy");
        askQuestion("bootstrap eto backend", "net");
        askQuestion("cto budet esli koshka syest koshachiyu myatu", "nichego");



        System.out.println("fin");
        System.out.println("vash schet: " + score);
    }

    private static void askQuestion(String question, String correctAnswer) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("pravilno");
            score += 10;
        } else {
            System.out.println("nepravilno");
            lives--;
        }

        if (lives == 0) {
            System.out.println("netu bolshe jisney");
            System.out.println("vashi balli: " + score);
            System.exit(0);
        }
    }
}

