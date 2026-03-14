class FourFive1
{
	public static void main(String[] args)
	{
		char a[][]={{'A','B','C','D','E'},{'E','F','G','H','I'},{'J','K','L','M','N'},{'I','J','K','L','M'}};
		System.out.println("THE CHARACTER TABLE ");
		System.out.println("       Coloumn");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Row "+(i+1)+": ");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}