import football.Event1XBetFootball;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Integer.parseInt;
import static classes.UsefulMethods.getHtml;

public class Main {

    public static void main(String[] args) {
        //ArrayList<String> leonLiveUrls = checkLeonLive("https://leon55.bet/ru-ru/live");
        //ArrayList<String> oneXLiveUrls = check1XLive("https://1xlite-468986.top/ru/live/football");
        Event1XBetFootball event1XBet = new Event1XBetFootball("https://1xlite-468986.top/ru/live/football/21317-africa-cup-of-nations/505218318-namibia-mali");
        //football.EventLeonFootball eventLeon = new football.EventLeonFootball("https://leon55.bet/ru-ru/bets/soccer/italy/italy-super-coppa/1970324843198110-inter-milan-lazio");
    }
    public static ArrayList<String> checkLeonLive(String mainUrl){
        open(mainUrl);
        int count =  parseInt($("span.sportline-filter__item-icon_S11wk").getText());
        ArrayList<String> listLeon = new ArrayList<String>();
        for(int i = 0; i < count; i++){
            listLeon.add($$("a.sportline-event-block-container__info_cayoG").get(i).getAttribute("href"));
        }
        return listLeon;
    }
    public static ArrayList<String> check1XLive(String mainUrl){
        String html = getHtml(mainUrl);//
        int count =  html.split("</span> <a href=\"").length;
        ArrayList<String> list1X = new ArrayList<String>();
        for(int i = 1; i < count; i++){
            if(html.split("</span> <a href=\"")[i].split("\" class")[0].split("/").length > 5)
                list1X.add(html.split("</span> <a href=\"")[i].split("\" class")[0]);
        }
        return list1X;
    }
}
