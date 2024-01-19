import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Double.parseDouble;

public class EventLeon extends Event{

    public EventLeon(String url){
        this.url = url;
        open(url);
        //this.p1name = setP1Name(html);
        //this.p2name = setP2Name(html);
        this.p1 = parseDouble($(".sport-event-list-item-market__runner_ET0eg span",1).getValue());
        //this.draw = setDraw(html);
        //this.p2 = setP2(html);
        //this.matchp1 = setP1Match(html);
        //this.matchp2 = setP2Match(html);
    }

    @Override
    double setP1(String html) {
        return 0;
    }

    @Override
    double setDraw(String html) {
        return 0;
    }

    @Override
    double setP2(String html) {
        return 0;
    }

    @Override
    double setP1Match(String html) {
        return 0;
    }

    @Override
    double setP2Match(String html) {
        return 0;
    }

    @Override
    String setP1Name(String html) {
        return null;
    }

    @Override
    String setP2Name(String html) {
        return null;
    }
}
