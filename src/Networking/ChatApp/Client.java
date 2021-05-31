package Networking.ChatApp;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client 
{
	public static void main(String args[]) throws Exception
	{
		Socket so=new Socket("localhost",6000);
		
		DataInputStream din=new DataInputStream(so.getInputStream());
		DataOutputStream dout=new DataOutputStream(so.getOutputStream());
		dout.writeUTF("");
		
		Scanner input =new Scanner(System.in);
		
		String s1="",s2="";
		
		while(! (s1.equals("stop") || s2.equals("stop")) )
		{
			s1=din.readUTF();
			
			System.out.println("Server : "+s1);
			
			s2=input.nextLine();
			
			dout.writeUTF(s2);
			
			dout.flush();
		
		}
		
		dout.close();
		din.close();
		
		so.close();
		
	}

}
