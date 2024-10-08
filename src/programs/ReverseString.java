package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		/* Logic 1- Using recursive
		 * Logic 2- Using character array
		 * */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse.");
		String str = sc.nextLine(), rev="";
		//logic 1
		/*
		 * int len=str.length(); 
		 * for (int i=len-1; i>=0;i--) 
		 * { 
		 *  rev=rev+str.charAt(i); 
		 * }
		 */
		
		//logic 2
		/*
		 * char a[]= str.toCharArray(); 
		 * int len= str.length(); 
		 * for(int i=len-1;i>=0;i--)
		 * { 
		 * rev=rev+a[i];
		 * }
		 */
		
		//logic 3
		StringBuffer sb = new StringBuffer(str);
		 StringBuffer rev2 =sb.reverse();
		System.out.println("Reversed String is "+rev2);
	}

}
