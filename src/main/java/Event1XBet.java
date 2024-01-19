import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Event1XBet extends Event {


    public Event1XBet(String url){
        this.url = url;
        String html = getHtml(url);
        this.p1name = setP1Name(html);
        this.p2name = setP2Name(html);
        this.p1 = setP1(html);
        this.draw = setDraw(html);
        this.p2 = setP2(html);
        this.matchp1 = setP1Match(html);
        this.matchp2 = setP2Match(html);
    }
    @Override
    public double setP1(String html){
        String p1;
        p1 = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[1].split(",G:")[0];
        return parseDouble(p1);
    }
    @Override
    public double setDraw(String html){
        String draw;
        draw = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[2].split(",G:")[0];
        return parseDouble(draw);
    }
    @Override
    public double setP2(String html){
        String draw;
        draw = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[3].split(",G:")[0];
        return parseDouble(draw);
    }
    @Override
    public double setP1Match(String html){
        String p1Match;
        p1Match = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[4].split(",G:")[0];
        return parseDouble(p1Match);
    }
    @Override
    public double setP2Match(String html){
        String p2Match;
        p2Match = html.split("unparsedMarketGroupsByGameId")[1].split("C:")[5].split(",G:")[0];
        return parseDouble(p2Match);
    }
    @Override
    public String  setP1Name(String html){
        String name;
        name = html.split("firstOpponentNameEng:\"")[1].split("\",")[0];
        return name;
    }
    @Override
    public String  setP2Name(String html){
        String name;
        name = html.split("secondOpponentNameEng:\"")[1].split("\",")[0];
        return name;
    }

}
