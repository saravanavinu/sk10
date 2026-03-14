import java.util.Scanner;
class MarkStatement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][3];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Student "+(i+1));
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print("mark "+(j+1)+" :");
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("THE MARK LIST OF THE STUDENTS");
		System.out.println("      	   Marks");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Student "+(i+1)+": ");
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}