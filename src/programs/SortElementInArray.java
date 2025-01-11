package programs;

import java.util.Scanner;

public class SortElementInArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter "+n+" elements of array");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
//		Ascending
//		for (int i=0;i<n;i++)
//		{
//			for (int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) 
//				{ 
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp; 
//				} 
//			}
//		}
//		for (int i=0;i<n;i++) 
//		{ 
//			System.out.println(a[i]); 
//		}
		// Descending
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) 
				{ 
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp; 
				} 
			}
		}
		for (int i=0;i<n;i++) 
		{ 
			System.out.println(a[i]); 
		}

	}

}
