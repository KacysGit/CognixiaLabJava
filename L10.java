package pac1;

import java.util.Scanner;

public class L10 {
	
	static boolean isPositive(String words)
	{
		// Remove spaces to ignore them in the comparison
        words = words.replaceAll(" ", "");
        
		boolean isPos = true;
		for(int i = 0; i < words.length() - 1 && isPos == true; i++)
		{
			if(words.charAt(i) > words.charAt(i+1))
				isPos = false;
		}
		
		return isPos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter a word or sentence: ");
		String userEntry = SC.nextLine();

		System.out.println("You entered: "+userEntry);
		boolean isPos = isPositive(userEntry);
		
		if(isPos == true)
			System.out.println(userEntry+" is a positive sentence.");
		else
			System.out.println(userEntry+" is a negative sentence");
		System.out.println();
		
	}

}
