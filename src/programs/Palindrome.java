package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number to check palindrome");
		Scanner sc = new Scanner(System.in);
		int rev=0, num= sc.nextInt();
		int temp=num;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println(num+ " is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
	}

}
