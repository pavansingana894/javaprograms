import java.util.*;
public class linearSearch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter the size");
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		for(int i=0;i<arr.length-1;i++){Add commentMore actions
		    if(arr[i]==s){
		        System.out.println(i);
		        System.exit(0);
		    }
		}
		System.out.println("not found");
	}
}
