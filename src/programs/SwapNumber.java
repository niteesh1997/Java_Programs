package programs;

public class SwapNumber {

	public static void main(String[] args) {
		/*Swapping two numbers using 5 methods
		 * 1) logic 1- Third variable
		 * 2) logic 2- add and, subtract
		 * 3) logic 3- multiply, divide
		 * 4) logic 4- betwise operator
		 * 5) logic 5- single statement
		 */
		int a=10, b=20;
		//logic 1
		/*
		 * System.out.println("Before Swapping a="+a+"   b="+b); int c=a; a=b; b=c;
		 * System.out.println("After Swapping a="+a+"   b="+b);
		 */

		//	logic 2
		/*
		 * System.out.println("Before Swapping a="+a+"   b="+b); 
		 * a=a+b; //a=30 b=20
		 * b=a-b; //a=30 b=10 a=a-b; //a=20 b=10
		 * System.out.println("After Swapping a="+a+"   b="+b);
		 */

		//logic 3  
		// non zero value
		/*System.out.println("Before Swapping a="+a+"   b="+b); 
		 * a=a*b; 
		 * b=a/b; 
		 * a=a/b;
		 * System.out.println("After Swapping a="+a+"   b="+b);
		 */	

		// logic 4
		/*
		 * System.out.println("Before Swapping a="+a+"   b="+b); 
		 * a=a^b;
		 *  b=a^b; 
		 *  a=a^b;
		 * System.out.println("After Swapping a="+a+"   b="+b);
		 */
		
		//logic 5
		/*
		 * System.out.println("Before Swapping a="+a+"   b="+b); 
		 * a=a+b-(a=b); 
		 * System.out.println("After Swapping a="+a+"   b="+b);
		 */
		}

}
