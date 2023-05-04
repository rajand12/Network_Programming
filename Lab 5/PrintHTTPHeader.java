//Write a program to print entire headers of a website.

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class PrintHTTPHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.alankhanal.com.np");
            URLConnection conn = url.openConnection();

            //Get the header fields
            Map<String, List<String>> headers = conn.getHeaderFields();

            //Print the header fields
            for(Map.Entry<String,List<String>> entry: headers.entrySet()){

                String key = entry.getKey();
                List<String> values = entry.getValue();
                for(String value: values){
                    System.out.println(key + ":" + value);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
