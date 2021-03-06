public class Lab_09_AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;			
		}
		System.out.println("Numbers...");
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("The average of the above numbers is... " + average(numbers));
	}
	
	public static int average(int[] avg)
	{
		int sum = 0;
		for(int num : avg)
		{
			sum += num;
		}
		return sum / 10;
	}
}