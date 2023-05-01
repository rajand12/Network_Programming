//Write a program for resolving relative URI

import java.net.URI;
import java.net.URL;

public class Relative_URI {
    public static void main(String[] args) {
        try {
            String baseURLString = "https://achsnepal.edu.np";
            String relativeURIString = "/programs/";

            URL baseURL = new URL(baseURLString);
            URI relativeURI = new URI(relativeURIString);

            URI resolvedURI = baseURL.toURI().resolve(relativeURI);
            String resolvedURIString = resolvedURI.toString();
            System.out.println("Resolved URI: " + resolvedURIString);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
