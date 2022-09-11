import java.util.Scanner;
class vowels1
{
	public static void main(String args[])
	{
	
	char ch;
	Scanner sc=new Scanner(System.in);
	
	ch=sc.nextLine().charAt(0);
	
	switch(ch)
	   {
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;
	   }

	
	}
}