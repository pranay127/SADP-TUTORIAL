package tut2;


import java.io.*;  
import java.net.*;  
import java.util.Scanner;
public class Client { 
	private int count;

	public Client(int count)
	{
		this.count = count;
	}
    synchronized void connect() {  
    try{      
    Socket s=new Socket("localhost",6666);  
    DataInputStream dis=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    String str ="";
    Scanner sc = new Scanner(System.in);
    System.out.println("CLIENT "+count+"\nServer connected ");
    System.out.print("Me "+count+" : ");
    //while(str.compareTo("y")==0)
    {
    	str = sc.next();
    	dout.writeUTF(str);
    	dout.flush();
    	dis.readUTF();
    }
    System.out.println(count+" Server disconnected "); 
    }catch(Exception e){System.out.println(e);}  
    }

	
}  