package football;

import classes.EventFootBall;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Double.parseDouble;

public class EventLeonFootball extends EventFootBall {

    public EventLeonFootball(String url){
        this.url = url;
        open(url);
        this.p1name = setP1Name("test");
        this.p2name = setP2Name("test");
        this.p1 = setP1("test");
        this.draw = setDraw("test");
        this.p2 = setP2("test");

        this.p1x = setP2("test");
        this.p12 = setP2("test");
        this.p2x = setP2("test");
    }

    @Override
    public double setP1(String html) {
        return parseDouble($("button.sport-event-list-item-market__runner_ET0eg",0).$("span",1).getText());
    }

    @Override
    public double setDraw(String html) {
        return parseDouble($("button.sport-event-list-item-market__runner_ET0eg",1).$("span",1).getText());
    }


    @Override
    public double setP2(String html) {
        return parseDouble($("button.sport-event-list-item-market__runner_ET0eg",2).$("span",1).getText());
    }
    @Override
    public String setP1Name(String html) {
        return null;
    }


    @Override
    public String setP2Name(String html) {
        return null;
    }

    @Override
    public double setP2X(String someStr) {
        return 0;
    }

    @Override
    public double setP1X(String someStr) {
        return 0;
    }

    @Override
    public double setP12(String someStr) {
        return 0;
    }

    @Override
    public double setBothGoalYes(String someStr) {
        return 0;
    }

    @Override
    public double setBothGoalNo(String someStr) {
        return 0;
    }

    @Override
    public double setFora(String someStr, String findForaRegex) {
        return 0;
    }

    @Override
    public double setTotal(String someStr, String findForaRegex) {
        return 0;
    }


}
