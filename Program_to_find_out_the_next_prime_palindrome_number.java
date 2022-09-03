import java.util.Scanner;
class sample
{   
    public static boolean prime(int n)
    {
         int c=0,i;
         for(i=2;i<=n/2;i++)
         {
              if(n%i==0)
              c++;
         }
    if(c==0)
        return true;
    else
        return false;
    }
    public static boolean palindrome(int n)
    {
        int sum=0,r,a=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(a==sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n+1; ;i++)
        {
            if(prime(i)&&palindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
        
    }
}