class EvenFibonnaci{
	public static void main(String[] args) {
		int x = 1, y =2;
		int fib =0;
		int sum=0;
		while(x<=4000000)
		{
			if(x%2==0)
			{
				sum+=x;
			}
			fib = x+y;
			x=y;
			y=fib;
			
			
			

		}
		System.out.println(sum);

	}
}