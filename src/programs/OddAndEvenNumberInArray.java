package programs;

import java.util.Scanner;

public class OddAndEvenNumberInArray {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Even numbers");
		for (int i=0;i<n;i++) {
			if (a[i]%2==0)
				System.out.println(a[i]);
		}	
		System.out.println("Odd numbers");
		for (int i=0;i<n;i++) {
			if (a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
}
