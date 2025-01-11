package javaNotes;

public class ConditionalStatements {

	public static void main(String[] args) {
		int age=17;
		
		if(age>=18) {
			System.out.println("Is eligible for voting");
		}
		else
			System.out.println("not eligible");
		
		//nested if-else
		int i=18;
		if(i>10) {
			if(i>20) {
				if(i>30) {
					System.out.println("Number is greater than 30");
				}
			}else
				System.out.println("Number is greater than 10 and smaller than 20");
		}else
			System.out.println("Number is smaller than 10");
		int a=34, b=43, c=24;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is largest number");
			}else
				System.out.println("C is largest number");
		}
		else {
			if(b>c){
				System.out.println("B is largest Number");
			}
			else
				System.out.println("C is largest number");
		}
		if (a>b&&a>c)
			System.out.println(a+"is largest number");
		else if(b>a&&b>c)
			System.out.println(b+" is largest number");
		else
			System.out.println(c+" is largest number");
		int weekNum=10;
		switch(weekNum){
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednsday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default:System.out.println("invalid Week Number");
		
		}
	}

}
