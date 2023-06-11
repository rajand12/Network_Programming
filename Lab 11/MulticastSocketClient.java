import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSocketClient {
    public static void main(String[] args) {
        try {
            //Define the multicast group and port
            InetAddress multicastGroup = InetAddress.getByName("239.0.0.1");
            int port = 8888;

            //Create a multicast socket and join the multicast group
            MulticastSocket multicastSocket = new MulticastSocket(port);
            multicastSocket.joinGroup(multicastGroup);

            //Create a buffer to store received data
            byte[] buffer = new byte[1024];

            //Create a datagram packet for receiving the data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            while(true){
                //Receive a packet
                multicastSocket.receive(packet);

                //Extract the received data
                String receivedData = new String(packet.getData(),0,packet.getLength());

                //Check if the packet is from the desired host
                if(packet.getAddress().getHostAddress().equals("172.16.3.95")){
                    System.out.println("Received data from the desired host: " +receivedData);

                }
                else{
                    System.out.println("Received data from a different host: " + receivedData);
                }

                //Clear the buffer for the next packet
                packet.setLength(buffer.length);                   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
