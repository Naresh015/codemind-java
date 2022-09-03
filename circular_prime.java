import java.util.Scanner;
class circularprime
{ 
    public static boolean prime(int n)
    {
        int i,c=0;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int n,a,b,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(prime(n))
          {  while(n>0)
            {
            b=n%10;
            c=c*10+b;
            n=n/10;
            }
            if(prime(c))
                System.out.println("circular prime");
            else
              System.out.println("prime but not a circular prime");
          }
        else
            System.out.println("not prime");
    }
}