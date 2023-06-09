
public class ques2 {

	static int sum=0;
	static double sum_power=0;
	
	public static int calculateDifference(int n)
	{
		
		for (int i=1;i<(n+1);i++)
		{
			sum = sum +i;
			sum_power = sum_power + Math.pow(i, 2);
		}

		return ((int)Math.pow(sum, 2) - (int)sum_power);
	}
	
	public static void main(String args[])
	{
		System.out.println(calculateDifference(3));
	}
}
