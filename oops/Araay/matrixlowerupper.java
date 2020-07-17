import java.util.Scanner;
class matrixupper{
	public static void main(String args[]){
		System.out.println("main method started..");
		  int[][] mat=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
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
			
	int upp_sumsd=0;	
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i+j==1||i+j==0)
					upp_sumsd+=mat[i][j];
}
		System.out.println();
}	
		int upp_sumpd=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i<j)
					upp_sumpd+=mat[i][j];
}
		System.out.println();
}	
		
		
			
			
					
					

		System.out.println("upper sum secondary diagonal =" +upp_sumsd);
		System.out.println("upper sum principal diagonal =" +upp_sumpd);



		System.out.println("main method ended..");
 
}


}