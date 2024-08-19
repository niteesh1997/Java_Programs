package programs;

import java.util.Scanner;

public class EvenOddDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check Even and Odd Digits");
		int num= sc.nextInt();
		int temp=num, rem=0, oddcount=0, evencount=0;
		
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			if(rem%2==0) {
				evencount++;
			}
			else
				oddcount++;
		}
		System.out.println("There are "+oddcount+" odd digits and "+evencount+" Event Digits in"+num );
	}
	
	
}
