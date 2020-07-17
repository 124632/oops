class smallofnum{
	public  static void main(String args[]){
	System.out.println("main method started..");

	int[] arr={10,-2,70,0,-8};
	int small=arr[0];

	for(int i=1;i<arr.length;i++){
		if(small>arr[i])
			small=arr[i];
}
	System.out.println("smallest num is:"+small);
	System.out.println("main method ended..");

}
}