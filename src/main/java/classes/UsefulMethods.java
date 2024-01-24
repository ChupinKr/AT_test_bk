package classes;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UsefulMethods {

    //region SideFunctions
    public static String getHtml(String url){
        String content = null;
        URLConnection connection = null;
        try {
            connection =  new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream(), "utf-8");
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return content;
    }
}
