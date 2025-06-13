public class nQueen
{
    static int n=4;
	public static void main(String[] args) {
		int[][] ar=new int[n][n];
		solve(ar,0);
	}
	static void solve(int ar[][],int r){
	    if(r==n){
	        print(ar);
	    System.out.println();
	    return;
	}
	for(int c=0;c<n;c++){
	    if(safe(ar,r,c)){
	        ar[r][c]=1;
	        solve(ar,r+1);
	        ar[r][c]=0;
	    }
	   }
    }
    static void print(int[][]ar){
    for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar.length;j++){
            System.out.print(ar[i][j]+" ");
          }
          System.out.println();
       }
   }
   static boolean safe(int[][] ar,int r,int c){
       int r1=r;
       int c1=c;
       while(r1>-1){
           if(ar[r1][c1]==1) return false;
           r1-=1;
       }
       int r2=r;
       int c2=c;
       while(r2>-1 && c2>-1){
           if(ar[r2][c2]==1) return false;
           r2-=1;
           c2-=1;
   }
       int r3=r;
       int c3=c;
       while(r3>-1 && c3<ar.length){
           if(ar[r3][c3]==1) return false;
           r3-=1;
           c3+=1;
       }
       return true;
   }
}
