import java.util.Scanner;
public class IT26510428Lab3Q1B{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price of 1kg of rice: ");
		int price=input.nextInt();
		System.out.println("Enter the number of kilograms you want to buy: ");
		int kilograms=input.nextInt();
		double total=price*kilograms;
		double discount=total*0.10;
		double discountprice= total-discount;
		System.out.println("The total amount with 10% discount: "+discountprice);
	}
}