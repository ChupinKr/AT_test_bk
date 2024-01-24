package classes;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

abstract public class EventFootBall {

    public String url = null;
    public String p1name = null;
    public String p2name = null;
    public double p1 = 0;
    public double draw = 0;
    public double p2 = 0;
    public double p1x = 0;
    public double p12 = 0;
    public double p2x = 0;
    public double bothGoalYes = 0;
    public double bothGoalNo = 0;
    public double total0_5B = 0;
    public double total1B = 0;
    public double total1_5B = 0;
    public double total2B = 0;
    public double total2_5B = 0;
    public double total3B = 0;
    public double total3_5B = 0;
    public double total4B = 0;
    public double total4_5B = 0;
    public double total5B = 0;
    public double total5_5B = 0;
    public double total6B = 0;
    public double total6_5B = 0;
    public double total7B = 0;
    public double total7_5B = 0;
    public double total8B = 0;
    public double total8_5B = 0;
    public double total9B = 0;
    public double total9_5B = 0;
    public double total10B = 0;
    public double total0_5M = 0;
    public double total1M = 0;
    public double total1_5M = 0;
    public double total2M = 0;
    public double total2_5M = 0;
    public double total3M = 0;
    public double total3_5M = 0;
    public double total4M = 0;
    public double total4_5M = 0;
    public double total5M = 0;
    public double total5_5M = 0;
    public double total6M = 0;
    public double total6_5M = 0;
    public double total7M = 0;
    public double total7_5M = 0;
    public double total8M = 0;
    public double total8_5M = 0;
    public double total9M = 0;
    public double total9_5M = 0;
    public double total10M = 0;
    public double foraM0_5 = 0;
    public double foraM1 = 0;
    public double foraM1_5 = 0;
    public double foraM2 = 0;
    public double foraM2_5 = 0;
    public double foraM3 = 0;
    public double foraM3_5 = 0;
    public double foraM4 = 0;
    public double foraM4_5 = 0;
    public double foraM5 = 0;
    public double foraM5_5 = 0;
    public double foraM6 = 0;
    public double foraM6_5 = 0;
    public double foraM7 = 0;
    public double foraB0_5 = 0;
    public double foraB1 = 0;
    public double foraB1_5 = 0;
    public double foraB2 = 0;
    public double foraB2_5 = 0;
    public double foraB3 = 0;
    public double foraB3_5 = 0;
    public double foraB4 = 0;
    public double foraB4_5 = 0;
    public double foraB5 = 0;
    public double foraB5_5 = 0;
    public double foraB6 = 0;
    public double foraB6_5 = 0;
    public double foraB7 = 0;



    abstract public double setP1(String someStr);
    abstract public double setDraw(String someStr);
    abstract public double setP2(String someStr);

    abstract public String setP1Name(String someStr);

    abstract public String setP2Name(String someStr);
    abstract public double setP2X(String someStr);
    abstract public double setP1X(String someStr);
    abstract public double setP12(String someStr);
    abstract public double setBothGoalYes(String someStr);
    abstract public double setBothGoalNo(String someStr);
    abstract public double setFora(String someStr, String findForaRegex);
    abstract public double setTotal0_5(String someStr);
    abstract public double setTotal1(String someStr);
    abstract public double setTotal1_5(String someStr);
    abstract public double setTotal2(String someStr);
    abstract public double setTotal2_5(String someStr);
    abstract public double setTotal3(String someStr);
    abstract public double setTotal3_5(String someStr);
    abstract public double setTotal4(String someStr);
    abstract public double setTotal4_5(String someStr);
    abstract public double setTotal5(String someStr);
    abstract public double setTotal5_5(String someStr);
    abstract public double setTotal6(String someStr);
    abstract public double setTotal6_5(String someStr);
    abstract public double setTotal7(String someStr);
    abstract public double setTotal7_5(String someStr);
    abstract public double setTotal8(String someStr);
    abstract public double setTotal8_5(String someStr);
    abstract public double setTotal9(String someStr);
    abstract public double setTotal9_5(String someStr);
    abstract public double setTotal10(String someStr);

    //region SideFunctions
    public String getHtml(String url){
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
