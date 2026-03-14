import java.util.Scanner;
class FourFive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a[][]=new char[4][5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Row "+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter the "+(j+1)+" "+"character :");
				a[i][j]=sc.next().charAt(0);
			}
		}
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