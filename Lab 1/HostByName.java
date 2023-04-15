import java.net.*;
public class HostByName {
    
    public static void main(String args[]) 
    {
        try 
        {
            // Create an InetAddress object for a given hostname and IP address.
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(address); 
        } 
        catch (UnknownHostException e) 
        {
            System.out.println("Couldn't find www.facebook.com");
        }
    }

}

