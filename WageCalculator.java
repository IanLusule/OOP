package wage;
import java.util.Scanner;


public class WageCalculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.out.println("Wage Calculator");
System.out.println("--------------------");
String regNo;
double payRate;
int hours;
double total;
Scanner in = new Scanner(System.in);
System.out.println("Enter your registration number:");
regNo=in.nextLine();
System.out.println("Enter hourly pay rate:");
payRate = in.nextDouble();
System.out.println("Enter hours worked:");
hours=in.nextInt();
total=payRate*hours;
System.out.println();
System.out.println();
System.out.println("Wage Details:");

System.out.println("Registration Number:         "         +regNo);
System.out.println("Hourly Pay Rate:             $"         +payRate);
System.out.println("Hours Worked:                "            +hours);
System.out.println("Total Wages:                 $"              +total);  



	}

}
