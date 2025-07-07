import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many subjects do you have? ");
        int subjectCount = input.nextInt();
        int sum = 0;

        for (int s = 1; s <= subjectCount; s++) {
            System.out.print("Enter marks for Subject " + s + ": ");
            int score = input.nextInt();
            while (score < 0 || score > 100) {
                System.out.print("Invalid! Enter marks (0–100) for Subject " + s + ": ");
                score = input.nextInt();
            }
            sum += score;
        }

        double avg = (double) sum / subjectCount;

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + sum);
        System.out.printf("Average: %.2f%%\n", avg);

        String grade;
        if (avg >= 90) grade = "A+";
        else if (avg >= 80) grade = "A";
        else if (avg >= 70) grade = "B";
        else if (avg >= 60) grade = "C";
        else if (avg >= 50) grade = "D";
        else grade = "F";

        System.out.println("Grade: " + grade);
        input.close();
    }
}
