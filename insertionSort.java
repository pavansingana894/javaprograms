import java.util.*;
public class insertionSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++){
		   int key=arr[i];
		   int j=i-1;
		   while((j>=0) && (arr[j]>key)){
		   arr[j+1]=arr[j];
		   j-=1;
		   }
		   arr[j+1]=key;
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
