//Write a program to print the URL of a URLConnection to "google.com"

import java.net.URL;
import java.net.URLConnection;

public class PrintURLConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();
            System.out.println("URL of connection: " + conn.getURL());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
