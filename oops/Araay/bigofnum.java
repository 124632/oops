class bigofnum{
	public static void main(String args[]){
	 System.out.println("main method started...");
	int[] arr={10,20,30,40,50};
	int big=arr[0];
	

	for(int i=1;i<arr.length;i++){
		if(big<arr[i])
			big=arr[i];
			
}
	System.out.println("Biggest num is:"+big);
	
 System.out.println("main method ended...");
}
	
}