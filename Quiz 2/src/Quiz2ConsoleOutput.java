import java.util.Scanner;

public class Quiz2ConsoleOutput
{
	private static String correctUsername = "mtg2912";
	private static String correctPassword = "Password12";
	private static String username;
	private static String password;
	
	static Scanner input= new Scanner(System.in);
	
	public static void main(String[]args)
	{
		boolean status=false;
		
		System.out.println("Enter username");
		username=input.nextLine();
		status=authenticateUsername(username);
		if (status==true)
		{
			status=false;
			System.out.println("Enter password");
			password=input.nextLine();
			status=authenticatePassword(password);
			if(status==true)
			{
				System.out.println("Welcome "+username+"!");
			}
			else
			{
				System.out.println("Invalid password");
			}
		}
		else
		{
			System.out.println("Invalid username");
		}
		
	}//end main
	
	public static boolean authenticateUsername(String username)
	{
		boolean authentic=false;
		if(username.equals(correctUsername))
		{
			authentic=true;
		}
		
		return(authentic);
	}
	
	public static boolean authenticatePassword(String password)
	{
		boolean authentic=false;
		if(password.equals(correctPassword))
		{
			authentic=true;
		}
		
		return(authentic);
	}

}
