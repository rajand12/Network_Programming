import java.net.*;
import java.util.*;

public class ListNetworkInterface {
    public static void main(String[] args) throws SocketException {
        Enumeration <NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
        }
    }    
}
