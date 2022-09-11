import java.util.Scanner;
class grades
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a,b,c,p=50,q=60,r=100;
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	
	if(a>p && b>q && c>r)
		System.out.println("10");
	else if(a>p && b>q)
		System.out.println("9");
	else if(b>q && c>r)
		System.out.println("8");
	else if(a>p &&c>r)
		System.out.println("7");
	else if(a>p || b>q || c>r)
		System.out.println("6");
	else
		System.out.println("5");
        s.close();
	}
}