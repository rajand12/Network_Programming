import java.net.*;
public class IpAddressOfSystem {
    
    public static void main(String args[]) 
    {
        try 
        {
            // Create an InetAddress object for a given hostname and IP address.
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("The IP address of local host is " + address); 
            //ia = InetAddress.getByName();
            //System.out.println("The IP address of " + args[] +" : " +ia);
        }
        catch (UnknownHostException e) 
        {
            System.out.println("Couldn't find localhost");
        }
    }

}

