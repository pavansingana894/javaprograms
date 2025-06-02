import java.util.*;
public class Linear
{
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
		   a[i]=sc.nextInt();
		}
		int flag=1;
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++){
		    if(a[i]==n){
		      System.out.println("found at index"+i);
		      flag=0;
		      break;
		    }
		}
		if(flag==1){
		    System.out.println("index is not found");
		}
	}
}