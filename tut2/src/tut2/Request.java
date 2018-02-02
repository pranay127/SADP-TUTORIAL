package tut2;


import java.util.Scanner;

public class Request {

	static Scanner sc = new Scanner(System.in);
	static int count=0;
	synchronized private static void multipleclient()
	{
		Client cli = new Client(count);
		cli.connect();
	}
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.print("Do you want to connect to server?(y/n) : ");
			String s  = sc.next();
			if(s.compareTo("y")==0)
				{
					++count;
					multipleclient();
				}
			else
			{
				Server.stop();
			}
		}

	}

}
