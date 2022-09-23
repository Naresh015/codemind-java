import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,a=0,b=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
                a=a+x[i];
            else
                b=b+x[i];  
        }
        if(a-b>b-a)
            System.out.println(a-b);
        else
            System.out.println(b-a);
    }
}