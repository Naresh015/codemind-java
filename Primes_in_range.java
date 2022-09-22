import java.util.Scanner;
class numbers
{
    public static boolean isprime(int n)
    {
        int c=0,i;
        for(i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==1)
            return true;
        else
            return false;
        
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,a,b,c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==1)
		    a=2;
		for(i=a;i<=b;i++)
		{
			if(isprime(i))
			    c++;
		}
		System.out.println(c);
	}
	
}