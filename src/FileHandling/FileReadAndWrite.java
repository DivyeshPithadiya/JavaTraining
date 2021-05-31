package FileHandling;
import java.io.*;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Divyesh\\eclipse-workspace\\Training\\src\\FileHandling\\File.txt");
		
		// File Reading 
		
		FileReader fr=new FileReader(f);
		
		char[] ch=new char[(int)f.length()];
		
		fr.read(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		// File Reading 
		
		// ----------------------------------------------
		
		//File Writing
		
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("We are Learning File Handling");
		
		fw.flush();
		
		fw.close();
		
		//File Writing
		
		// ----------------------------------------------
		
		// File Reading 
		
		FileReader fr0=new FileReader(f);
		
		char[] ch0=new char[(int)f.length()];
		
		fr0.read(ch0);
		
		for(int i=0;i<ch0.length;i++)
		{
			System.out.print(ch0[i]);
		}
		
		// File Reading 
	}

}
