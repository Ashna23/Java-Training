
public class quest1 {
	
	static int sum=0;
	public static int calculateSum(int n)
	{
		
		for (int i=1;i<(n+1);i++)
		{
			
			if (i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}

		return sum;
	}
	
	public static void main(String args[])
	{
		System.out.println(calculateSum(3));
	}

}
