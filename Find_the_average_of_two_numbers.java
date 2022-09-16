import java.util.Scanner;
class sample
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        float average;
        a=sc.nextInt();
        b=sc.nextInt();
        average=(float)(a+b)/2;
        System.out.format("%.4f",average);
        sc.close();
        }
    
}