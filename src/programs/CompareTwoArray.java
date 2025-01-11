package programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArray {

	public static void main(String[] args) {
		//		System.out.println("Enter size of array");
		//		Scanner sc = new Scanner(System.in);
		//		int n1= sc.nextInt();
		//		int[] a1= new int[n1];
		//		System.out.println("Enter "+n1+" elements of array");
		//		for (int i=0;i<n1;i++) {
		//			a1[i]=sc.nextInt();
		//		}
		//		System.out.println("Enter size of array");
		//		int n2= sc.nextInt();
		//		int[] a2= new int[n2];
		//		System.out.println("Enter "+n2+" elements of array");
		//		for (int i=0;i<n2;i++) {
		//			a1[i]=sc.nextInt();
		//		}
		int a1[]= {1,2,3};
		int a2[]= {1,1,3};

		//		boolean status = Arrays.equals(a1, a2); 
		
		
		boolean status=true;
		if (a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i])
					status=false;
			}

		}
		else {
			status=false;
		}
		if(status==true) {
			System.out.println("Both array are equal");
		}
		else {
			System.out.println("Both array are not equal");
		}
	}

}
