import java.util.Scanner;
class grades
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a;
	a=s.nextInt();
	if(a>0)
		System.out.println("Positive Number");
	else
		System.out.println("Negative Number");
        s.close();
	}
}