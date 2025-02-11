package pac1;

import java.util.Scanner;

public class L9 {
	
	static String addToSelf(String words)
	{
		return words + words;
	}
	
	static String oddToHashtag(String words)
	{
		String returnString = "";
		for(int i = 0; i < words.length(); i++) 
		{
			if(i % 2 == 0) returnString += words.charAt(i);
			else returnString += '#';
		}
		
		return returnString;
	}
	
	static String removeDuplicates(String words)
	{
		String noDups = "";
		
		for(int i = 0; i < words.length(); i++) {
			char currentChar = words.charAt(i);
			if (noDups.indexOf(currentChar) == -1)
			{
				noDups += currentChar;
			}
		}
		
		return noDups;
	}
	
	static String oddToUpper(String words)
	{
		String revised = "";
		
		for(int i = 0; i < words.length(); i++)
		{
			if(i % 2 == 0)
			{
				revised += words.charAt(i);
			}
			else 
			{
				char upperChar = Character.toUpperCase(words.charAt(i));
				revised += upperChar;
			}
		}
		
		return revised;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter a word or sentence: ");
		String userEntry = SC.nextLine();

		System.out.println("You entered: "+userEntry);
		int option = 0;
		while(option >4 || option < 1)
		{
			System.out.println("Enter the number associated with "
					+ "the action you'd like to complete: ");
			System.out.println("1, Add the word/sentence to itself.");
			System.out.println("2, Replace odd positions with #.");
			System.out.println("3, Remove duplicate characters in the string.");
			System.out.println("4, Change odd characters to upper case.");
			option = SC.nextInt();
			
			if(option >4 || option < 1)
			{
				System.out.println("That was not one of the options.");
			}
		}
		
		
		System.out.println("You chose option "+option);
		switch(option)
		{
		case 1:
			System.out.println("Your input added to itself is "+addToSelf(userEntry));
			break;
		case 2:
			System.out.println("Replacing odd positions with # yields: "+oddToHashtag(userEntry));
			break;
		case 3:
			System.out.println("Removed duplicate characters in the string: "+removeDuplicates(userEntry));
			break;
		case 4:
			System.out.println("Changed odd characters to upper case: "+oddToUpper(userEntry));
			break;
		
		}
	}

}
