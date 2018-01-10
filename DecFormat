import java.text.DecimalFormat;

public class one 
{
	public static void main(String[] args)
	{
		int x1 = 1, x2 = 3, y1 = 5, y2 = 7;
		double result = distance(x1, y1, x2, y2);
		System.out.println(result);
		
		System.out.println("After decimal format");
		result = myFormat(result);
		System.out.println( result );
	}
	
	public static double distance(int x1, int y1, int x2, int y2)
	{
		int x = x2 - x1;
		x = (int) Math.pow(x, 2);
		
		int y = y2 - y1;
		y = (int) Math.pow(y, 2);
		
		return Math.sqrt(x + y);
		
	}
	
	public static double myFormat(double result)
	{
		DecimalFormat df = new DecimalFormat("#.##");
		result = Double.parseDouble( df.format(result) );
		
		return result;
		
	}
}
