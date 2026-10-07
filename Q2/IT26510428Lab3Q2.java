import java.util.Scanner;
public class IT26510428Lab3Q2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the monthly salary: ");
		int salary=input.nextInt();
		System.out.println("Enter the number of OT hours: ");
		double hours=input.nextDouble();
		System.out.println("Enter the OT hourly rate: ");
		double rate=input.nextDouble();
		double total=salary+(rate*hours);
		System.out.println("The total salary including OT hours is: "+total);
	}
}