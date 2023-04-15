import java.io.*;
import java.net.*;
public class DemoInetAddress {
    public static void main(String[] args) {
        try{
            InetAddress obj = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: "+ obj.getHostName());
            System.out.println("Host Address: "+ obj.getHostAddress());

        }
        catch(Exception e){
            
        }
    }
}
