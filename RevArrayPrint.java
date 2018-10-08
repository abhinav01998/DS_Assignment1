import java.util.Scanner;

class reversePrint{
	public void printReverse(int arr[],int n){
	     int arr2[] = new int[n];
		 int i,j=0;
		 for(i=n-1;i>=0;i--){
			 arr2[j]=arr[i];
			 j++;
		 }
		 for(i=0;i<n;i++){
			 System.out.print(arr2[i]+" ");
		 }
	}
}

public class RevArrayPrint{
	public static void main(String args[]){
		Scanner s1 =new Scanner(System.in);
		reversePrint R1 = new reversePrint();
		int i,n;
		//Enter the size of ARRAY;
		n = s1.nextInt();
		int arr[] = new int[n];
		for(i=0;i<n;i++){
			arr[i] = s1.nextInt();
		}
		R1.printReverse(arr,n);
	}
}