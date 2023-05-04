//Write a program to get the time  when the URL was last changed

import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class URLlastModifiedTime {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.example.com");
        URLConnection conn = url.openConnection();
        long lastModified = conn.getLastModified();
        Date date = new Date(lastModified);
        System.out.println("Last Modified time: " + date);
    }
}
