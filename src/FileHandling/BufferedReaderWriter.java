package FileHandling;

import java.io.*;

public class BufferedReaderWriter 
{
	
	public static void main(String args[]) throws IOException
	{
		
		// -------------------------------------
		
		FileWriter f=new FileWriter("C:\\Users\\Divyesh\\eclipse-workspace\\Training\\src\\FileHandling\\File.txt");
		
		BufferedWriter bw=new BufferedWriter(f);
		
		bw.write("This is Divyesh");
		bw.newLine();
		bw.append("I am 21 Years Old");
		
		bw.flush();
		
		bw.close();
		
		// -------------------------------------
		
		FileReader fr=new FileReader("C:\\Users\\Divyesh\\eclipse-workspace\\Training\\src\\FileHandling\\File.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String i=br.readLine();
		
		while(i!=null)
		{
			System.out.println(i);
			i=br.readLine();
		}
		
	
	}

}
