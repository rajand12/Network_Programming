import java.io.*;
import java.net.*;

public class Download_an_object {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.google.com");
            Object obj = u.getContent();
            System.out.println("I got a " + obj.getClass().getName());

        } catch (MalformedURLException e) {
            System.out.println("is not a parsable URL");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}