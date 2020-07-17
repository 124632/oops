import java.util.Scanner;
class matrixdiag{
	public static void main(String args[]){
		System.out.println("main  method started..");
			int[][] matrixdig=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					matrixdig[i][j]=sc.nextInt();
}
}
		int sum=0,sum1=0;
		System.out.println("addition of principal diagonal elements:");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i==j){
						sum=sum+matrixdig[i][j];
		System.out.println("sum="+sum);
}
}
}
		System.out.println("addition of secondary diagonal elements:");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if((i+j)==2){
						sum1=sum1+matrixdig[i][j];
		System.out.println("sum1="+sum1);
}
}
}
		System.out.println("main method ended..");
}
}