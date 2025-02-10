package pac1;

public class L3_ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 200;
		System.out.println("Else/if statements");
		if(b > a)
		{
			System.out.println("b is bigger!");
		}
		else if (b < a)
		{
			System.out.println("a is bigger!");
		}
		else 
			System.out.println("They are equal!");

		System.out.println("For loop and switch statements");
		for(int i = 0; i <= 5; i++)
		{
			switch(i)
			{
				case 0: 
					System.out.println("i value is zero");
					break;
				case 1:
					System.out.println("i value is 1");
					break;
				case 2:
					System.out.println("i value is 2");
					break;
				case 3:
					System.out.println("i value is 3");
					break;
				case 4:
					System.out.println("i value is 4");
					break;
					default:
						System.out.println("i value is greater than 4.");
			}
			
		}
		
		int n=5;
		System.out.println("While loop");
		while(n > 0)
		{
			System.out.println(n);
			n--;
		}
		
		int m = 5;
		System.out.println("Do while loop");
		do
		{
			System.out.println(m);
			m--;
		}while(m>0);
		
		System.out.println("for loops again");
		for(int j = 5; j > 0; j--)
		{
			System.out.println("j value: " +j);
		}
		
		
	
	}

}
