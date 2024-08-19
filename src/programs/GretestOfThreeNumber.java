package programs;

import java.util.Scanner;

public class GretestOfThreeNumber {

	public static void main(String[] args) {
		System.out.println("Enter three nunmber to check gretest of three number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		/*
		 * if(a>b && a>c) 
		 * {
		 * 	 System.out.println(a+" is gretest number"); 
		 * }
		 * else if(b>a && b>c) 
		 * { 
		 * System.out.println(b+" is gretest number"); 
		 * }
		 * else {
		 * System.out.println(c+" is gretest number"); 
		 * }
		 */
		int large=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(large+ " is largest number");
	}

}
