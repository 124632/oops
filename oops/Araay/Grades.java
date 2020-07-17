import java.util.Scanner;

class Grades{
	public static void main(String args[]){
	
	System.out.println("main method started..");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of sub:");
	int size=sc.nextInt();
	System.out.println("enter max marks:");
	int maxMarks=sc.nextInt();
	int[] marks=new int[size];
	System.out.println("enter "+size+" sub marks");
	
	for(int i=0;i<marks.length;i++){
	marks[i]=sc.nextInt();
}
	double sum=0;
	System.out.println("enter sub marks");
	for(int i=0;i<marks.length;i++){
	System.out.print(marks[i]+"\t");
	sum+=marks[i];
	
}
	double perc=(sum/maxMarks)*100;
	System.out.println("\npercentage="+perc);

	System.out.println("main method ended..");

	 

}
}