import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = input.nextLine();
		reverseText(text);
	}
	
	public static void reverseText(String text)
	{
		StringBuilder str = new StringBuilder(text);
		
		text = str.reverse().toString();
		System.out.println(text);
		int counter = 0;
		boolean flag = true;
		while(counter != text.length()-1)
		{
			if(text.charAt(counter) != text.charAt(text.length()-counter-1))
			{
				flag = false;
			}
		}
		if(flag == true)
			System.out.println("Text is a palindrome");
	}
}
