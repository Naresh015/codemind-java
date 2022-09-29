import java.util.Scanner;
class add1
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int x,y,z[],a=0,i;
    x=sc.nextInt();
    z=new int[x];
    for(y=0;y<x;y++)
        z[y]=sc.nextInt();
    for(i=0;i<x;i++)
    {
       a=a+z[i]; 
    }
    System.out.println(a);
   }
}