package com.olek;

import java.net.*;
import java.io.*;

public class Client {
public static void main(String[] args)throws Exception {
	Client client=new Client();
	client.run();
}
public void run() throws Exception{
	Socket socket=new Socket("localhost",8888);
	PrintStream printstreamm=new PrintStream(socket.getOutputStream());
	printstreamm.println("Hello ,from Client");
	
	BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	
	String message=bufferedreader.readLine();
	System.out.println(message);
	socket.close();
}
}
