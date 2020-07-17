import java.util.Scanner;

class IncrementItem{
	public static void main(String[] args){
	System.out.println("main method started..");
 	Scanner sc=new Scanner(System.in);
	
	int[] intArr={10,20,30,40,50};
	
	for(int i=0;i<intArr.length;i++){
		intArr[i]++;
}
	System.out.println("latest array elements:");
	for(int i=0;i<intArr.length;i++){
		System.out.println(intArr[i]);
}
	System.out.println("divisible by 10;");
	for(int i=0;i<intArr.length;i++){
		intArr[i]/=10;
	System.out.println("division of 10 is:");
	System.out.println(intArr[i]);
}
}
}
