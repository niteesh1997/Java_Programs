package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to find factorial");
		Scanner sc = new Scanner(System.in);
		int fact=1, num=sc.nextInt();
		//for(int i=1; i<=num; i++)
		for (int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
