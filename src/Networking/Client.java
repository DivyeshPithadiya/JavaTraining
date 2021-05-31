package Networking;
import java.io.*;
import java.net.*;

public class Client 
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Socket s=new Socket("localhost",5000);
		
		DataOutputStream d=new DataOutputStream(s.getOutputStream());
		
		d.writeUTF("This is Client Side");
		
		d.flush();
		
		d.close();
		
		s.close();
		
	}

}
