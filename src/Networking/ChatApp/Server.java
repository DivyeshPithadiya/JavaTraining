package Networking.ChatApp;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server 
{
	public static void main(String args[]) throws Exception
	{
		
		
		ServerSocket s=new ServerSocket(6000);
		
		Socket so=s.accept();
		
		DataInputStream din=new DataInputStream(so.getInputStream());
		DataOutputStream dout=new DataOutputStream(so.getOutputStream());

		System.out.println();
		
		Scanner input =new Scanner(System.in);
		
		String s1="",s2="";
		
		while(! (s1.equals("stop") || s2.equals("stop")) )
		{
			s1=din.readUTF();
			
			System.out.println("Client : "+s1);
			
			s2=input.nextLine();
			
			dout.writeUTF(s2);
			
			dout.flush();
		
		}
		
		dout.close();
		din.close();
		
		s.close();
		so.close();
		
	}

}
