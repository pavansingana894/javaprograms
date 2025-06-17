import java.util.*;
public class binarySearch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		System.out.println("enter the elements:");
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to find:");
		int s=sc.nextInt();
		int i=0;
		int j=arr.length-1;
		while(i<=j){
		    int mid=(i+j)/2;
		    if(arr[mid]==s){
		        System.out.println(mid);
		        System.exit(0);
		    }
		    else if(arr[mid]<s) i=mid+1;
		    else if(arr[mid]>s) j=mid-1;
		}
		System.out.println("not found");
	}
}
