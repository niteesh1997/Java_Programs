package programs;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to count the digits");
		int count=0, num= sc.nextInt();
		int temp=num;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		System.out.println("number of digits in "+num+" is "+count);
	}

}
