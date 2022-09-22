import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,a,b,sum;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
    }
}