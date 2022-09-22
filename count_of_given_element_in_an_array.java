import java.util.Scanner;
class array5{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[],i,n,k,c=0;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		k=sc.nextInt();
		for(i=n-1;i>=0;i--)
		{
		    if(x[i]==k)
		        c++;
		    //System.out.println(c);
		}
		System.out.println(c);
	}
}