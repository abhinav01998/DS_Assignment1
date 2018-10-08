import java.util.Scanner;

class Print{
	public void printarr(int[][] arr,int r,int c){
		int i,j;
		for(i=0;i<r;i++){
			if(i%2==0){
           for(j=0;j<c;j++){
			   System.out.print(arr[i][j]+" ");
		   }
			}
			else{
				for(j=c-1;j>=0;j--){
			   System.out.print(arr[i][j]+" ");
		   }
			}
		}
	}
}

public class rowPrint{
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		Print P = new Print();
		int i,j,r,c;
		System.out.println("Enter the no. of rows and columns respectively:");
		r=s1.nextInt();
		c = s1.nextInt();
		int arr[][] = new int[r][c];
		for(i=0;i<r;i++){
           for(j=0;j<c;j++){
			   arr[i][j]=s1.nextInt();
		   }
		}
		P.printarr(arr,r,c);
	}
}