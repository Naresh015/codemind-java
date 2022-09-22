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
        if(count!=0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0 && isprime(i))
            {
              c++;
            }
        }
        System.out.println(c);
    }
}