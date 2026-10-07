import java.util.Scanner;
public class IT26510428Lab3Q4{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a five-digit number: ");
		int number=input.nextInt();
		int no1=number/10000;
		number=number%10000;
		int no2=number/1000;
		number=number%1000;
		int no3=number/100;
		number=number%100;
		int no4=number/10;
		number=number%10;
		int no5=number;
		System.out.println(no1+" "+no2+" "+no3+" "+no4+" "+no5);
	}
}
		