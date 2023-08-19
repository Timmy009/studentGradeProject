package studentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeSystem {
    private int numberOfStudent;
  private  int numberOfSubject;
    Scanner scanner = new Scanner(System.in);
    private int [][] arraysOfStudent;

    public GradeSystem() {
        System.out.println("How many student do you have");
        this.numberOfStudent =   scanner.nextInt();
        System.out.println("How many subjects do they offer");
       this.numberOfSubject = scanner.nextInt();
       arraysOfStudent = new int [numberOfStudent][numberOfSubject];
    }

    public void getScores () {
        for (int count = 0; count < numberOfStudent; count++) {
            System.out.println("Enter score for the " + count + " student");
            for (int countTwo = 0; countTwo < numberOfSubject; countTwo++) {
                System.out.println("Enter score for the subject " + countTwo);
                int score = scanner.nextInt();
                  arraysOfStudent[count][countTwo] = score;
            }
        }
    }


    public double calculateTotal(int student) {
        double total = 0;
        for (int countTwo = 0; countTwo < numberOfSubject; countTwo++) {
          total +=  arraysOfStudent[student][countTwo];
        }
return total;
    }


    public double calculateAverage(int student) {
        double total = 0;
        double average = 0;
        for (int countTwo = 0; countTwo < numberOfSubject; countTwo++) {
            total +=  arraysOfStudent[student][countTwo];
        }
        average = total / numberOfSubject;
        return average;
    }


    public int position () {

    }
}
