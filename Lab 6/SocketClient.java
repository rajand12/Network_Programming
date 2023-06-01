//Write a program to create a socket to client.

import java.net.*;
import java.io.*;

public class SocketClient{
    public static void main(String[] args) {
        String serverHostname = "localhost";
        int serverPort = 1345;
        
        try {
            Socket clientSocket = new Socket(serverHostname,serverPort);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            //send a message to  the server 
            String message = "Hello Server!";
            out.println(message);
            out.flush();
            System.out.println("Sent message to the server: " + message);

            //Read the server's response
            String response = in.readLine();
            System.out.println("Received response from server: " + message);

            //Close the connection
            clientSocket.close();
            System.out.println("Connection Closed");

        } catch (IOException e) {
            System.err.println("Exception caught: " + e);
        }
    }
}