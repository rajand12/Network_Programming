//Write a program to verify that you are receiving multicast data.

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class MulticastSocketServer {
    public static void main(String[] args) {
        try {
            //Define the multicast group and port
            InetAddress multicastGroup = InetAddress.getByName("239.0.0.1");
            int port = 8888;

            //Create a multicast socket and join the multicast group
            MulticastSocket multicastSocket = new MulticastSocket(port);
            multicastSocket.joinGroup(multicastGroup);

            //Create a buffer to store data
            String message = "Hello from the server!";
            byte[] buffer = message.getBytes();

            //Create a datagram packet containing the data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,multicastGroup, port);

            //Send the packet repeatedly
            while(true){
                multicastSocket.send(packet);
                System.out.println("Sent multicast message: " +message);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
