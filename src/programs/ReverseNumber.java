package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num= sc.nextInt();
		
		/*
		 * logic 1- algorithm
		 * logic 2- stringBufferClass method
		 * logic 3- stringBuilder
		 */
		
		/*
		 * int rev=0; while(num!=0) 
		 * {
		 *  rev=rev*10 + num%10; 
		 *  num=num/10; 
		 *  }
		 */
		 
		//logic 2
		/*
		 * StringBuffer rev; StringBuffer sb= new StringBuffer(String.valueOf(num)); rev
		 * =sb.reverse();
		 */
		
		//logic 3
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("Reversed Number= "+rev);
	}

}
