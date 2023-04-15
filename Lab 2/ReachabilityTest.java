import java.net.*;
public class ReachabilityTest {
    public static void main(String[] args) {
        try{
            InetAddress net = InetAddress.getByName("8.8.8.8");
            if(net.isReachable(100))
            System.out.println("Success");
            else
            System.out.println("Failed");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
