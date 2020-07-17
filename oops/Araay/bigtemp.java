import java.util.Scanner;

class  bigltemp{
	public static void main(String args[]){
	System.out.println("main method started..");
	int[] arr=new int[1];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter array elements");
	//arr[]=sc.nextInt();
	
	
	int temp=0;
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]<arr[i+1]){
	

			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
}
}

	System.out.println("big="+temp);

	 
	System.out.println("main method ended..");
}

}