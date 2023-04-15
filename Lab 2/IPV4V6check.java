//Write a program to determine whether an IP address is IPV4 or IPV6.
import java.net.*;

public class IPV4V6check {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("2404:6800:4002:823::2004");
            byte[] address = ia.getAddress();
            if(address.length == 4){
                System.out.println("IPV4");
            }
            else if(address.length == 16){
                System.out.println("IPV6");
            }

        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
