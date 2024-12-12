package javaNotes;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operator					+ - * / %
		
		int a= 20, b=10;
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Differance of a and b is: "+(a-b));
		System.out.println("Multiple of a and b is: "+(a*b));
		System.out.println("Division of a and b is: "+(a/b));
		System.out.println("Mod of a and b is: "+(a%b));
		System.out.println();
		//Relational Operator					> >= < <= != ==
		//int a= 20, b=10;
		System.out.println("Is a Greater than b :"+(a>b));
		System.out.println("Is a Greater or equal to b :"+(a>=b));
		System.out.println("Is a Smaller than b :"+(a<b));
		System.out.println("Is a Smaller or Equal to b :"+(a<=b));
		System.out.println("Is a Not Rqual to b :"+(a!=b));
		System.out.println("Is a Equal to b :"+(a==b));
		System.out.println();
		
		//Logical Operator					&& || ! 
		/*
		 x		y		x&&y		x||y		!x		!y
		 --------------------------------------------------
		 true	true	true		true		false	false
		 true	false	false		true				true
		 false	true	false		true		true
		 false	false	false		false
		 */
		int c =30;
		System.out.println(a>b&&b>c);
		System.out.println(a>b&&c>b);
		System.out.println(a>b||b>c);
		System.out.println(a>b||c>b);
		System.out.println(!(a>b&&b>c));
		
		//Increment & Decrement Operator		++ --
		// pre increment ++a, ++b
		// Post increment a++, b++
		System.out.println(++a);
		System.out.println(++b);
		System.out.println();
		
		//Assignment Operator					= += -= *= /= %=
		/*
		 a=a+10 this can be written as a+=10
		 a=a-10 this can be written as a-=10
		 a=a*10 this can be written as a*=10
		 a=a/10 this can be written as a/=10
		 a=a%10 this can be written as a%=10
		 */
		int m=10, n=20, o=30, p=40, q=50;
		System.out.println(m+=10);
		System.out.println(n-=10);
		System.out.println(o*=10);
		System.out.println(p/=10);
		System.out.println(q%=10);
		System.out.println();
		
		//Conditional Operator				?:
		//(var=exp? result1:Result2)
		int k=100, l=200;
		String res=(k>l?"pass":"fail");
		System.out.println(res);
		System.out.println();
		
		int age=17;
		String res1=(age>=18?"Eligible":"Not Eligible");
		System.out.println(res1);
		System.out.println();
	}

}
