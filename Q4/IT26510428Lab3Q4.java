import java.util.Scanner;
public class IT26510428Lab3Q4{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Rupee amount: ");
	int number=input.nextInt();
	int no1=number/5000;
	number=number%5000;
	int no2=number/1000;
	number=number%1000;
	int no3=number/500;
	number=number%500;
	int no4=number/100;
	number=number%100;
	int no5=number/50;
	number=number%50;
	int no6=number/20;
	number=number%20;
	int no7=number/10;
	number=number%10;
	int no8=number/5;
	number=number%5;
	int no9=number/2;
	number=number%2;
	int no10=number;
	System.out.println("5000 Notes-"+no1);
	System.out.println("1000 Notes-"+no2);
	System.out.println("500 Notes-"+no3);
	System.out.println("100 Notes-"+no4);
	System.out.println("50 Notes-"+no5);
	System.out.println("20 Notes-"+no6);
	System.out.println("10 coins-"+no7);
	System.out.println("5 coins-"+no8);
	System.out.println("2 coins-"+no9);
	System.out.println("1 coins-"+no10);
	}
}
	
	
	
	
	