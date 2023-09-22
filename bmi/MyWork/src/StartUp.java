import java.util.Scanner;

public class StartUp{


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your weight ");
        int weight = scanner.nextInt();
        System.out.println("Enter you height ");
        int height = scanner.nextInt();
        double bmi = weight / (height*height);
        System.out.println("your bmi is " +bmi);





        scanner.close();
    }
}
