import java.util.Scanner;

class max{
	public int findmax(int[] arr,int n){
		int m = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>m){
				m=arr[i];
			}
		}
		return m;
	}
}
public class ArrayInput{
	public static void main(String args[]){
		max m1 = new max();
		Scanner s1 = new Scanner(System.in);
		int i,size,maxx;
		System.out.println("Enter size of array");
		size = s1.nextInt();
		int arr[] = new int[size];
		for(i=0;i<size;i++){
			arr[i] = s1.nextInt();
		}
		for(i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		maxx = m1.findmax(arr,size);
		System.out.println("Max is: "+maxx);
	}
}