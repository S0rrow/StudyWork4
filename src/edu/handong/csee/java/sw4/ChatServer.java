package edu.handong.csee.java.sw4;

import java.io.IOException;
import java.net.ServerSocket;

public class ChatServer {
	ChatServer(){
		try {
			ServerSocket server = new ServerSocket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
