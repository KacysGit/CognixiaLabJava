package pac1;
import java.util.Scanner;
import static java.lang.Math.*;
public class TC_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = SC.nextInt();
		
		if(num < 0)
			System.out.println(num+" is a negative number.");
		else
			System.out.println(num+" is a positive number");
		
		
		
	}

}
