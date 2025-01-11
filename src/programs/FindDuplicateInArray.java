package programs;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		String a[] = {"Java", "Python", "HTML", "C", "C++"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println("Found Duplicate Element: "+a[i]);
					
				}
			}
		}
		}

}
