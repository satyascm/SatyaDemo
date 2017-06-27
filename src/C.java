class C 
{
	public static void main(String[] args) 
	{
		int i = 0,j;
		j = i++   +   i    +   i++    + i;
		System.out.println("=============================================");
		System.out.println("==============  Postusage ===================");
		System.out.println("=============================================");

		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		i = 3;
		j =  i-- + i + i-- + i + i-- + i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println(i*j);
		System.out.println("============");
		i = 0;
		j = i++  +  i  +  i--  +  i  +  i++  +i;
			//0     1     1       0     0      1
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");

		i = 0;
		j = i++  +  i  +  i--  +  i  +  i--  + i +  i++  + i  + i++  + i  +  i--  + i;
			//0     1     1       0     0      -1	-1		0	0		1		1	0
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");

		System.out.println("=============================================");
		System.out.println("===========     Preusage   ==================");
		System.out.println("=============================================");
		i = 0;
		j = ++i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		i = 0;
		j = --i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		i = 0;
		j = ++i + i + ++i + i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		i = 0;
		j = ++i + i + --i + i + --i + i + --i + i + --i + i + ++i + i;
		// 1		1	0	0	-1		-1	-2	-2	-3	-3		-2	-2
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		//-2 -14 -16
		System.out.println("=======================================================");
		System.out.println("===========     Preusage & Postusage ==================");
		System.out.println("=======================================================");

		i = 0;
		
		j = i++ + i + ++i + i + i-- + i + ++i + i + ++i + i + i-- + i++ + i;
		// 0	1	2	2	2		1	2	2	    3	3		3	2     3
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("============");
		//3 26 29
	}
}
