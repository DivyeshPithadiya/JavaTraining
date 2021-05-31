package Networking;

import java.net.*;
import java.io.*;

public class APICall 
{
	
	public static void main(String args[]) throws Exception
	{
		URL u=new URL("https://my-bill-system.herokuapp.com/user-details/deep@gmail.com/deep4545");
		
		URLConnection uc=u.openConnection();
		
		InputStream data=uc.getInputStream();
		
		int i;
		
		while((i=data.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
