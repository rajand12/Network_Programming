import java.net.URL;
import java.io.*;
import java.lang.*;

public class HostPortProtocol {
    public static void main(String args[]) throws Exception
    
    {
        URL url = new URL ("http://www.gmail.com");
        try{
            System.out.println("Host Name:  " +url.getHost());
            System.out.println("Port NUmber: " +url.getPort());
            System.out.print("Protocol used: " +url.getProtocol());
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
    }
}
