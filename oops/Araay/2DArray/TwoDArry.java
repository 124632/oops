import  java.util.scanner;

class TwoDArray
{
	public static void main(String[] args){
		System.out.println(" main method started.....");

		Scanner sc = new scanner( System.in);
		System.out.println(" enter rows and colums");
		int r = sc. nextInt();
		int c = sc.nextInt();

		int[][] twoDArr = new int[r][c];
		System.out.println(" enter Array element");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				twoDArr[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println(" Two D Array elements are ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				twoDArr[i][j];
			}
		}
		System.out.println(" \nprincipal diagonal sum="+psum);
		//Sum of Secondary diognal elements
		int sSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i+j = =r-1)
					sSum+=twoDArr[i][j];
			}
		}
		System.out.println(" Secondary Diagonal Sum=" +sum);

		//Sum of element above principal diagonal
		int paSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i<j)
					paSum+=twoDArr[i][j];
			}
		}
		//Sum of element above principal diagonal
		int paSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i<j)
					paSum+=twoDArr[i][j];
			}
		}
		System.out.println(" Element above principal Diagonal Sum="+paSum);
		//Sum of element below principal diagonal
		int paSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i>j)
					paSum+=twoDArr[i][j];
			}
		}
		System.out.println(" Element below principal Diagonal Sum="+paSum);
		//Sum of element above secondary diagonal
		int sbSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i+j < r-1)
					saSum+=twoDArr[i][j];
			}
		}

		System.out.println(" Element  above secondary Diagonal Sum="+sbSum);
		//Sum of element below secondary diagonal 
		int sbSum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i+j < r-1)
					sbSum+=twoDArr[i][j];
			}
		}

		System.out.println(" Element  below secondary Diagonal Sum="+sbSum);
		System.out.println(" main method started.....");
	}
}
		

		