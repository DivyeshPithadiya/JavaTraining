package Networking;

import java.io.*;    
import java.net.*;    
public class HttpUrlConnection{    
public static void main(String[] args){    
try{    
URL url=new URL("http://kjsieit-exam-management-system.herokuapp.com/login.php");    
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
for(int i=1;i<=8;i++){  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e){System.out.println(e);}    
}    
}   