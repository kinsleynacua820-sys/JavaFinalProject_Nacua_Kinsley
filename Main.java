import java.util.Scanner;

class StudentGrades {

    Scanner input = new Scanner(System.in);
    double[] grades;
    int subjects;

    void inputGrades() {
        System.out.print("Enter number of subjects: ");
        subjects = input.nextInt();

        grades = new double[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }
    }

    double computeAverage() {
        double sum = 0;

        for (int i = 0; i < subjects; i++) {
            sum += grades[i];
        }

        return sum / subjects;
    }

    void displayResult() {
        double average = computeAverage();

        System.out.println("Average Grade: " + average);

        if (average >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentGrades student = new StudentGrades();
        int choice;

        do {
            System.out.println("=== STUDENT GRADE EVALUATION SYSTEM ===");
            System.out.println("1. Input Grades");
            System.out.println("2. Display Result");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    student.inputGrades();
                    break;
                case 2:
                    student.displayResult();
                    break;
                case 3:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

}
