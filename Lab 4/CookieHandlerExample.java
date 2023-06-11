//2. Write a program to implement CookieHandler class

import java.net.*;
import java.io.*;
import java.util.*;

public class CookieHandlerExample {
    public static void main(String[] args) {
        try {
            // Set the default cookie manager
            CookieManager ckm = new CookieManager();
            CookieHandler.setDefault(ckm);

            // Create a URL object for the desired page
            URL url = new URL("https://www.geeksforgeeks.org");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Send a request to the server
            connection.setRequestMethod("GET");
            connection.connect();

            // Print the cookies received from the server
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            List<String> cookiesHeader = headerFields.get("Set-Cookie");
            if (cookiesHeader != null) {
                for (String cookie : cookiesHeader) {
                    ckm.getCookieStore().add(null, HttpCookie.parse(cookie).get(0));
                }
            }
            System.out.println("Cookies: " + ckm.getCookieStore().getCookies());

            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
