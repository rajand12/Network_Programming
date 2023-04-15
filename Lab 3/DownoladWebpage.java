
//Write a program to download the content of a webpage.
import java.net.URL;
import java.io.*;

public class DownoladWebpage {
    public static void main(String[] args) {

        try {
            String webPageUrl = "https://www.javatpoint.com/java-layout-manager";
            URL url = new URL(webPageUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("myPage.html"));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Web page downloaded successfully");
        } catch (Exception e) {
            System.out.println("Some error occured.");
        }

    }
}
