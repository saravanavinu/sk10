import java.util.Scanner;
class City
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ar[][]=new String[4][3];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("State "+(i+1));
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print("City "+(j+1)+": ");
				ar[i][j]=sc.nextLine();
			}
		}
		System.out.println("CITIES AND STATES");
		System.out.println("        City");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("State "+(i+1)+": ");
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}