import java.net.URL;

public class URLSplitter {
    public static void main(String[] args) {
        String urlString = "https://www.javatpoint.com/java-layout-manager";
        try{
            URL url = new URL(urlString);
            System.out.println("Scheme: " + url.getProtocol());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());

        }
    }
}
