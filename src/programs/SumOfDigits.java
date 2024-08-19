package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find sum of digits");
		int sum=0, num= sc.nextInt();
		int temp=num;
		while(temp>0) {
			sum=sum+temp%10;
			temp=temp/10;
		}
		System.out.println("sum of digits of number "+num+" is "+ sum);
	}

}
