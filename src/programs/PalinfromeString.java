package programs;

import java.util.Scanner;

public class PalinfromeString {

	public static void main(String[] args) {
		System.out.println("Enter a number to check palindrome");
		Scanner sc = new Scanner(System.in);
		String rev="", num= sc.nextLine();
		String temp=num;
		int len=num.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev+temp.charAt(i);
		}
		if(rev.equals(num)) {
			System.out.println(num+" is Palindrome String");
		}
		else
			System.out.println(num+" is not a Palindrome String");
	}

}
