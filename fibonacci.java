import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        int a=0,b=1,n,i,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(a+" "+b);
        for(i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}