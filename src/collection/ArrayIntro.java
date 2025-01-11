package collection;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
		int [] x=new int[1000];
		System.out.println(x.getClass().getName());
		
		int[][] y=new int[3][];
		y[0]=new int[3] ;
		y[1]=new int[3] ;
		y[2]=new int[3] ;
	
		
		int [][][] z=new int[3][][];
		z[0]=new int[3][] ;
		z[1]=new int[3][];
		z[2]=new int[3][];
		
		z[0][0]=new int[3];
		z[0][1]=new int[3];
		z[0][2]=new int[3];
		
		z[1][0]=new int[3];
		z[1][1]=new int[3];
		z[1][2]=new int[3];
		
		z[2][0]=new int[3];
		z[2][1]=new int[3];
		z[2][2]=new int[3];
	}

}
