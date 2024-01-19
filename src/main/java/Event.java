import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

abstract public class Event {

    public String url = null;
    public String p1name = null;
    public String p2name = null;
    public double p1 = 0;
    public double draw = 0;
    public double p2 = 0;
    public double matchp1 = 0;
    public double matchp2 = 0;

    abstract double setP1(String html);
    abstract double setDraw(String html);
    abstract double setP2(String html);
    abstract double setP1Match(String html);
    abstract double setP2Match(String html);
    abstract String setP1Name(String html);
    abstract String setP2Name(String html);

    //region SideFunctions
    public String getHtml(String url){
        String content = null;
        URLConnection connection = null;
        try {
            connection =  new URL("https://1xlite-917010.top/ru/line/cricket/1852063-big-bash-league/198662853-sydney-thunder-melbourne-renegades").openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return content;
    }
}
