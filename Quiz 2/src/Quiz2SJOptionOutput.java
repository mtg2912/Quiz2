import javax.swing.*;

public class Quiz2SJOptionOutput
{
	private static String username;
	private static String password;
	
	public static void main(String[]args)
	{
		boolean status=false;
		
		username=JOptionPane.showInputDialog(null, "Enter username");
		status=Quiz2ConsoleOutput.authenticateUsername(username);
		if (status==true)
		{
			status=false;
			password=JOptionPane.showInputDialog(null, "Enter password");
			status=Quiz2ConsoleOutput.authenticatePassword(password);
			if(status==true)
			{
				JOptionPane.showMessageDialog(null, "Welcome "+username+"!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid password");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username");
		}
		
		
	}
}
