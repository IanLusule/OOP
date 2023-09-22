import java.util.Scanner;

public class sample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();


        String[] studentNames = new String[numStudents];
        double[][] marks = new double[numStudents][5];


        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Student Name: ");
            studentNames[i] = scanner.nextLine();


            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }


        System.out.println("\nMark Sheet");
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = 0;
            System.out.println("\nStudent Name: " + studentNames[i]);
            System.out.println("Subject\tMarks");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + "\t" + marks[i][j]);
                totalMarks += marks[i][j];
            }
            double averageMarks = totalMarks / 5;
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
        }


        System.out.println("\nUnit-wise Average Marks:");
        for (int j = 0; j < 5; j++) {
            double unitTotal = 0;
            for (int i = 0; i < numStudents; i++) {
                unitTotal += marks[i][j];
            }
            double unitAverage = unitTotal / numStudents;
            System.out.println("Unit " + (j + 1) + "\t" + unitAverage);
        }


        scanner.close();
    }
}

