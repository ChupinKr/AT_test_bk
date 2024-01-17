import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Event1XBet {
    private String url = null;
    private String p1name = null;
    private String p2name = null;
    private double p1 = 0;
    private double draw = 0;
    private double p2 = 0;
    private double matchp1 = 0;
    private double matchp2 = 0;
    public Event1XBet(String url){
        this.url = url;
        String html = getHtml(url);
        this.p1name = getByHtmlP1Name(html);
        this.p2name = getByHtmlP2Name(html);
        this.p1 = getByHtmlP1(html);
        this.draw = getByHtmlDraw(html);
        this.p2 = getByHtmlP2(html);
        this.matchp1 = getByHtmlP1Match(html);
        this.matchp2 = getByHtmlP2Match(html);
    }
    public double getByHtmlP1(String html){
        String p1;
        p1 = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[1].split(",G:")[0];
        return parseDouble(p1);
    }
    public double getByHtmlDraw(String html){
        String draw;
        draw = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[2].split(",G:")[0];
        return parseDouble(draw);
    }
    public double getByHtmlP2(String html){
        String draw;
        draw = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[3].split(",G:")[0];
        return parseDouble(draw);
    }
    public double getByHtmlP1Match(String html){
        String p1Match;
        p1Match = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[4].split(",G:")[0];
        return parseDouble(p1Match);
    }
    public double getByHtmlP2Match(String html){
        String p2Match;
        p2Match = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[5].split(",G:")[0];
        return parseDouble(p2Match);
    }
    public String  getByHtmlP1Name(String html){
        String name;
        name = html.split("firstOpponentNameEng:\"")[1].split("\",")[0];
        return name;
    }
    public String  getByHtmlP2Name(String html){
        String name;
        name = html.split("secondOpponentNameEng:\"")[1].split("\",")[0];
        return name;
    }

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
