import java.util.Scanner;

class ArrayDemo
{
	public static void main(String[] args)	
	{
		System.out.println("Main method started...");

		int[] marks=new int[6];

		marks[0]=25;
		marks[1]=30;
		marks[2]=35;
		marks[3]=40;
		marks[4]=45;
		marks[5]=50;

		System.out.println(marks[0] +"\t"+marks[1] +"\t"+marks[2] +"\t"+marks[3] +"\t"+marks[4] +"\t"+marks[5]);

		System.out.println("-------------");
	
		Scanner sc=new Scanner(System.in);

		int[] mark=new int[5];

		System.out.println("Enter Array Elements(5): ");
		for(int i=0;i<5;i++)
		{
			mark[i]=sc.nextInt();
		}

		System.out.println("Array Elements are:");
		for(int i=0;i<5;i++)
		{
			System.out.print(mark[i] +"\t");
		}

		System.out.println("\n-------------");

		int[] mrk={11,33,55,77,99};
		int size=mrk.length;

		System.out.println("Size of mrk Array Reference variable: "+size);

		char[] rainbow={'V','I','B','G','Y','O','R'};
		int len=rainbow.length;
		System.out.println("Size of Rainbow Array Reference variable: "+len);


		System.out.println("\nMain method ended...");
	}
}