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
    public static boolean ispalin(int n)
    {
        int sum=0,temp=n,r,i;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=a+1;;i++)
        {
            if((ispalin(i)) && (isprime(i)))
            {
                System.out.println(i);
                break;
            }
        }
        
    }
}