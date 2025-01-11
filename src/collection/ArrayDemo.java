package collection;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] x;
		
		
		int [] y= {1,2,3,4};
		
		int[] z= new int[3];
		z[0]=1;
		z[1]=3;
		z[2]=2;
		
		for(int ele:z) {
			System.out.println(ele);
		}
				
		int[][] a= {{1,2,3,4},{1,2,3,4}};
		
		for(int []array:a) {
			for(int ele:array) {
				System.out.println(ele);
			}
		}
	}
}
