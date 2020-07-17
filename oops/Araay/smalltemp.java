import java.util.Scanner;

class smalltemp{
	public static void main(String args[]){
	System.out.println("main method started..");
	int size;
	int[] arr=new int[4];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter array size");
	size=sc.nextInt();
	System.out.println("enter array ele:");
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
}
	
	
	int temp=0;
	int i;
	for(i=0;i<arr.length-1;i++){
		if(arr[i]<arr[i+1]){
	

			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
}
}

	System.out.println(arr[i+1]);

	 
	System.out.println("main method ended..");
}

}