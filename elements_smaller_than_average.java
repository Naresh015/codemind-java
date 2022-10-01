import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,j,a[],b=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=c+a[i];
        }
        for(i=0;i<n;i++)
        {
          if(a[i]<=c/n) 
          {
              b++;
          }
        }
        System.out.println(b);
    }
}