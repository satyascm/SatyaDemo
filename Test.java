public class Test {
	public class innerclass
	{
		public void m1()
		{
			System.out.println("Innerclass");	
		}
		
	}
	
	public static void main(String[] args)
	{
		new Test().new innerclass().m1();	
		System.out.println("Outerclass");
		Test t = new Test();
		Test.innerclass i = t.new innerclass()
			{
				public void m1()
				{
					System.out.println("satya's test class");	
				}	
			};
			i.m1();
		new Test().new innerclass().m1();
	}

}
