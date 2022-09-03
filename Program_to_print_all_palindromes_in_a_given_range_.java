import java.util.Scanner;
class sample
{ 
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
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        for(int i=n;i<=a;i++)
        {
            if(palindrome(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}