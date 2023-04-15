//Program to find the hostname from the given address.

import java.net.*;
 public class HostnameFromAddress{
    public static void main(String[] args) throws UnknownHostException{
        InetAddress ia = InetAddress.getByName("142.250.194.68");
        System.out.println(ia.getCanonicalHostName());
    }
 }