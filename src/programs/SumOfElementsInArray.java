package programs;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in array is "+sum);
	}

}
