package tut2;


import java.io.*;  
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Server implements Runnable{  
	static String str;
	static ArrayList<String> a = new ArrayList<String>();
    public static void main(String[] args){  
    	try{  
    	System.out.println("Server started ");
    	ServerSocket ss=new ServerSocket(6666);  
	    Socket s=ss.accept();
	    DataInputStream dis=new DataInputStream(s.getInputStream());
	    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	    
	    str ="";
	    Scanner sc = new Scanner(System.in);
	    System.out.println("SERVER\nClient connected "); 
	    while(str.compareTo("quit")!=0)
	    {
	    	
	    	str=(String)dis.readUTF();  
		    System.out.println("CLient "+str);
		    System.out.print("Me : ");
		    
		    Server SS = new Server();
		    Thread t = new Thread(SS);
		    t.start();
		    
		    dout.writeUTF(str);
		    dout.flush();
		    
	    }
	    System.out.println("Client disconnected ");
	    
	    System.out.println(a.toString());
	    }catch(Exception e){System.out.println(e);}  
    }  
   
    public synchronized static void stop()
   {
	   str = "quit";
   }
	@Override
	public void run() {
		
		Calculate cal = new Calculate();
	    str = cal.evaluate(str)+"";
	    a.add(str);
	    System.out.println(str);
	}
}  