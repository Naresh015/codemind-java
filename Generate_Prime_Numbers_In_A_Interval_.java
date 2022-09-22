import java.util.Scanner;
class primeinrange
{
    public static boolean isprime(int n)
    {
        int count=0,i;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                 count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b,i;
        n=sc.nextInt();
        b=sc.nextInt();
        if(n==1)
            n=2;
        for(i=n;i<b;i++)
        {
            if(isprime(i))
            {
              System.out.println(i);
            }
        }
        
    }
}