import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        int n,i,x[],a,b,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(x[j]<a)
            {
                c=c+x[j];
            }
            if(x[j]>b)
            {
                c=c+x[j];
            }
        }
        System.out.println(c);
    }
}