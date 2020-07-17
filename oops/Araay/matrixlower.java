class matrixlower{
	public static void main(String[] args){
		System.out.println("main method started..");
		int[][] mat=new mat[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					mat[i][j]=sc.nextInt();
}
}
		System.out.println("elements of matrix..");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.println(mat[i][j] +"\t");
}
		System.out.println();
}
		int low_sumsd=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i+j==3||i+j==4){
						low_sumsd+=mat[i][j];
}

}
		System.out.println("addition of secondary lower diagonal:"+low_sumsd); 
}
			int low_sumpd=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					ifi(i>j){
						low_sumpd+=mat[i][j];
}

}
		System.out.println("addition of principal lower diagonal:"+low_sumpd); 
}
		
			

		System.out.println("main method ended..");

}
}