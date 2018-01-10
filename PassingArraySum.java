public class PassingArraySum 
{
	public static void main(String[] args)
	{
		int[][] array = {{2,3,4}, {3,5}, {6,8,5}};
		print2DArray(array);
	}
	
	public static void print2DArray(int[][] array)
	{
		int sum;
		for(int set=0; set<array.length; set++)
		{
			sum = 0;
			for(int i=0; i<array[set].length; i++)
			{
				System.out.print(array[set][i] + " ");
				sum = sum + array[set][i];
			}
			System.out.println("|" + sum);
		}
	}
}

