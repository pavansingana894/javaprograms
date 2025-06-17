import java.util.*;
public class selectionSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
		    int m=i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]>arr[m]) m=j;
		        if(arr[j]<arr[m]) m=j;
		        int temp=arr[m];
		            arr[m]=arr[j];
		            arr[j]=temp;
		            arr[m]=arr[i];
		            arr[i]=temp;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
