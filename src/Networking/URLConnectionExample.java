package Networking;

import java.io.*;  
import java.net.*;  
public class URLConnectionExample {  
public static void main(String[] args){  
try{  
URL url=new URL("https://kjsieit-exam-management-system.herokuapp.com/login.php");  
URLConnection urlcon=url.openConnection();  

InputStream stream=urlcon.getInputStream();  //Printing Code of HTML Page 
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  


}catch(Exception e){System.out.println(e);}  
}  
}
