package Networking;
import java.net.*;

class urlDetails 
{
	void getDetails() throws Exception
	{
		URL u=new URL("https://kjsieit-exam-management-system.herokuapp.com/login.php");
		System.out.println("Protocol is :"+u.getProtocol());
		System.out.println("Port is :"+u.getPort());
		System.out.println("Host is :"+u.getHost());
		System.out.println("Content is :"+u.getContent());
		System.out.println("File is :"+u.getFile());
		
	}
}
public class URLClass 
{
	public static void main(String args[])
	{
		urlDetails u=new urlDetails();
		try 
		{
			u.getDetails();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
	}

}
