import java.util.Scanner;

public class spaceReplace 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = input.nextLine();
		vowelCounter(text);
	}
	
	public static void vowelCounter(String text)
	{
		StringBuilder str = new StringBuilder(text);
		char c;
		for(int j = 0; j<text.length(); j++)
		{
			c = text.charAt(j);
			if(c == ' ')
				str.setCharAt(j, '#');
		}
		text = str.toString();
		System.out.println(text);
	}
}
