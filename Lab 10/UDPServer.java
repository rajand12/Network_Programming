//Write a program for UDP client and UDP server.

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        //Define server port
        int serverPort = 12345;
        try {
            //Create a UDP Socket
            DatagramSocket serverSocket = new DatagramSocket(serverPort);
            System.out.println("UDP server is running and listening on port" + serverPort);

            while(true){
                //Create a buffer to receive incoming packets
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                //Receive the packet from the client 
                serverSocket.receive(receivePacket);

                //Get the client's Ip address and port
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                //Convert the received data to a string 
                String clientMessage = new String(receivePacket.getData()).trim();
                System.out.println("Received message from client: "+ clientMessage);

                //Process the message (e.g. perform some computation)
                String serverResponse = "Hello Client! Your message has been received";

                //Convert the response to bytes
                byte[] sendData = serverResponse.getBytes();

                //Create a UDP packet with the server's response 
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

                //send the response to the client
                serverSocket.send(sendPacket);
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
