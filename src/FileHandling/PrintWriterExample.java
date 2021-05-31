package FileHandling;
import java.io.*;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException 
	{
			
		PrintWriter p=new PrintWriter("C:\\Users\\Divyesh\\eclipse-workspace\\Training\\src\\FileHandling\\File.txt");
		p.println(false);
		p.print("Divyesh Pithadya ");
		p.print(21);
		p.print(" ");
		p.print(20.7);
		
		p.flush();
		
		p.close();

	}

}
