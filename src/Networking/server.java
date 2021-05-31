package Networking;
import java.net.*;
import java.io.*;

public class server 
{
	
	public static void main(String args[])
	{
		try 
		{
			ServerSocket s=new ServerSocket(5000); 
			Socket so=s.accept();
			DataInputStream d=new DataInputStream(so.getInputStream());
			System.out.println(d.readUTF());
			d.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
