import java.net.*;

public class CompareDomainName {
    public static void main(String[] args) {
        try {
            InetAddress facebook = InetAddress.getByName("www.facebook.com");
            InetAddress fb = InetAddress.getByName("www.fb.com");
            if(facebook.equals(fb)){
                System.out.println("The domain " + facebook +" and " + fb +" are same");
            }
            else{
                System.out.println("The domain " + facebook +" and " + fb +" are not same");
            }
            
        } catch (UnknownHostException e) {
            System.out.println("Host lookup failed");
        }
    }    
}
