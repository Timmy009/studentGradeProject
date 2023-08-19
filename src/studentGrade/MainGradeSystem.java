package studentGrade;

import java.util.Scanner;

public class MainGradeSystem {
    private static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        GradeSystem gradeSystem = new GradeSystem();
        gradeSystem.getScores();
    }


    private static void grade () {
        int numberOfStudent = inputInt("How many students do you have");
        int numberOfSubject = inputInt("How many subjects do they offer");


    }

    private static void displayString (String message ) {
        System.out.println(message);
    }


    private static String inputString (String message ) {
        displayString(message);
        return keyboardInput.next();
    }


    private static void displayDouble (String message ) {
        System.out.println(message);
    }


    private static double inputDouble (String message ) {
        displayDouble(message);
        return keyboardInput.nextDouble();
    }


    private static void displayInt (String message ) {
        System.out.println(message);
    }


    private static int inputInt (String message ) {
        displayInt(message);
        return keyboardInput.nextInt();
    }
}
