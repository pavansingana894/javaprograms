public class recursiveFibonacci
{
    public int fun(int n)
    {
        if(n<=1)
        {
        return 1;
        }
        return fun(n-1)+fun(n-2);
    }
	public static void main(String[] args) {
		Main m=new Main();
		System.out.println(m.fun(4));
	}
}