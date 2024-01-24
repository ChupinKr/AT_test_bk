package football;

import classes.EventFootBall;

import static java.lang.Double.parseDouble;
public class Event1XBetFootball extends EventFootBall {


    public Event1XBetFootball(String url) {
        this.url = url;
        String html = getHtml(url);
        var coefsHtml = html.split("unparsedMarketGroupsByGameId")[1].split("filteredMarketGroups")[0].split("\":\\[\\{E")[1].split("E:\\[");
        String coefs1x2 = "";
        String coefsDoubleChance = "";
        String coefsBothGoal = "";
        String coefsTotal = "";
        String coefsFora = "";
        for (int i = 0; i < coefsHtml.length; i++) {
            if (coefsHtml[i].split("G:1,GS:1").length > 1)
                coefs1x2 = coefsHtml[i];
            else if (coefsHtml[i].split("G:8,GS:2").length > 1) {
                coefsDoubleChance = coefsHtml[i];
            } else if (coefsHtml[i].split("G:19,GS:21").length > 1) {
                coefsBothGoal = coefsHtml[i];
            } else if (coefsHtml[i].split("G:17,GS:4").length > 1) {
                coefsTotal = coefsHtml[i];
            } else if (coefsHtml[i].split("G:2,GS:3").length > 1) {
                coefsFora = coefsHtml[i];
            }
        }
        String coefsTotalBigger = coefsTotal.split("],\\[")[0];
        String coefsTotalLess = coefsTotal.split("],\\[")[1];
        String coefsForaLess = coefsFora.split("],\\[")[0];
        String coefsForaBigger = coefsFora.split("],\\[")[1];
        this.p1name = setP1Name(html);
        this.p2name = setP2Name(html);
        if (coefs1x2 != "") {
            this.p1 = setP1(coefs1x2);
            this.draw = setDraw(coefs1x2);
            this.p2 = setP2(coefs1x2);
        }

        if (coefsDoubleChance != "") {
            this.p1x = setP1X(coefsDoubleChance);
            this.p12 = setP12(coefsDoubleChance);
            this.p2x = setP2X(coefsDoubleChance);
        }
        if (coefsBothGoal != "") {
            this.bothGoalYes = setBothGoalYes(coefsBothGoal);
            this.bothGoalNo = setBothGoalNo(coefsBothGoal);
        }
        if (coefsTotalBigger != "") {
            this.total0_5B = setTotal(coefsTotalBigger,"P:\\.5,");
            this.total1B = setTotal(coefsTotalBigger,"P:1,");
            this.total1_5B = setTotal(coefsTotalBigger,"P:1\\.5,");
            this.total2B = setTotal(coefsTotalBigger,"P:2,");
            this.total2_5B = setTotal(coefsTotalBigger,"P:2\\.5,");
            this.total3B = setTotal(coefsTotalBigger,"P:3,");
            this.total3_5B = setTotal(coefsTotalBigger,"P:3\\.5,");
            this.total4B = setTotal(coefsTotalBigger,"P:4,");
            this.total4_5B = setTotal(coefsTotalBigger,"P:4\\.5,");
            this.total5B = setTotal(coefsTotalBigger,"P:5,");
            this.total5_5B = setTotal(coefsTotalBigger,"P:5\\.5,");
            this.total6B = setTotal(coefsTotalBigger,"P:6,");
            this.total6_5B = setTotal(coefsTotalBigger,"P:6\\.5,");
            this.total7B = setTotal(coefsTotalBigger,"P:7,");
            this.total7_5B = setTotal(coefsTotalBigger,"P:7\\.5,");
            this.total8B = setTotal(coefsTotalBigger,"P:8,");
            this.total8_5B = setTotal(coefsTotalBigger,"P:8\\.5,");
            this.total9B = setTotal(coefsTotalBigger,"P:9,");
            this.total9_5B = setTotal(coefsTotalBigger,"P:9\\.5,");
            this.total10B = setTotal(coefsTotalBigger,"P:10,");
        }

        if (coefsTotalLess != "") {
            this.total0_5M = setTotal(coefsTotalLess,"P:\\.5,");
            this.total1M = setTotal(coefsTotalLess,"P:1,");
            this.total1_5M = setTotal(coefsTotalLess,"P:1\\.5,");
            this.total2M = setTotal(coefsTotalLess,"P:2,");
            this.total2_5M = setTotal(coefsTotalLess,"P:2\\.5,");
            this.total3M = setTotal(coefsTotalLess,"P:3,");
            this.total3_5M = setTotal(coefsTotalLess,"P:3\\.5,");
            this.total4M = setTotal(coefsTotalLess,"P:4,");
            this.total4_5M = setTotal(coefsTotalLess,"P:4\\.5,");
            this.total5M = setTotal(coefsTotalLess,"P:5,");
            this.total5_5M = setTotal(coefsTotalLess,"P:5\\.5,");
            this.total6M = setTotal(coefsTotalLess,"P:6,");
            this.total6_5M = setTotal(coefsTotalLess,"P:6\\.5,");
            this.total7M = setTotal(coefsTotalLess,"P:7,");
            this.total7_5M = setTotal(coefsTotalLess,"P:7\\.5,");
            this.total8M = setTotal(coefsTotalLess,"P:8,");
            this.total8_5M = setTotal(coefsTotalLess,"P:8\\.5,");
            this.total9M = setTotal(coefsTotalLess,"P:9,");
            this.total9_5M = setTotal(coefsTotalLess,"P:9\\.5,");
            this.total10M = setTotal(coefsTotalLess,"P:10,");
        }
        if(coefsForaLess != ""){
            this.foraM0_5 = setFora(coefsForaLess, "-\\.5,");
            this.foraM1 =   setFora(coefsForaLess, "-1,");
            this.foraM1_5 = setFora(coefsForaLess, "-1\\.5,");
            this.foraM2 =   setFora(coefsForaLess, "-2,");
            this.foraM2_5 = setFora(coefsForaLess, "-2\\.5,");
            this.foraM3 =   setFora(coefsForaLess, "-3,");
            this.foraM3_5 = setFora(coefsForaLess, "-3\\.5,");
            this.foraM4 =   setFora(coefsForaLess, "-4,");
            this.foraM4_5 = setFora(coefsForaLess, "-4\\.5,");
            this.foraM5 =   setFora(coefsForaLess, "-5,");
            this.foraM5_5 = setFora(coefsForaLess, "-5\\.5,");
            this.foraM6 =   setFora(coefsForaLess, "-6,");
            this.foraM6_5 = setFora(coefsForaLess, "-6\\.5,");
            this.foraM7 =   setFora(coefsForaLess, "-7,");
        }
        if(coefsForaBigger != ""){
            this.foraB0_5 = setFora(coefsForaBigger, "\\.5,");
            this.foraB1 =   setFora(coefsForaBigger, "1,");
            this.foraB1_5 = setFora(coefsForaBigger, "1\\.5,");
            this.foraB2 =   setFora(coefsForaBigger, "2,");
            this.foraB2_5 = setFora(coefsForaBigger, "2\\.5,");
            this.foraB3 =   setFora(coefsForaBigger, "3,");
            this.foraB3_5 = setFora(coefsForaBigger, "3\\.5,");
            this.foraB4 =   setFora(coefsForaBigger, "4,");
            this.foraB4_5 = setFora(coefsForaBigger, "4\\.5,");
            this.foraB5 =   setFora(coefsForaBigger, "5,");
            this.foraB5_5 = setFora(coefsForaBigger, "5\\.5,");
            this.foraB6 =   setFora(coefsForaBigger, "6,");
            this.foraB6_5 = setFora(coefsForaBigger, "6\\.5,");
            this.foraB7 =   setFora(coefsForaBigger, "7,");
        }
    }
    //region 1X2
    @Override
    public double setP1(String html){
        String result;
        result = html.split("C:")[1].split(",G:")[0];
        return parseDouble(result);
    }

    @Override
    public double setDraw(String html){
        String result;
        result = html.split("C:")[2].split(",G:")[0];
        return parseDouble(result);
    }
    @Override
    public double setP2(String html){
        String result;
        result = html.split("C:")[3].split(",G:")[0];
        return parseDouble(result);
    }
    //endregion
    //region names
    @Override
    public String setP1Name(String html){
        String name;
        name = html.split("firstOpponentName:\"")[1].split("\",")[0];
        return name;
    }

    @Override
    public String  setP2Name(String html){
        String name;
        name = html.split("secondOpponentName:\"")[1].split("\",")[0];
        return name;
    }
    //endregion
    //region double chance
    @Override
    public double setP1X(String someStr) {
        String result;
        result = someStr.split("C:")[1].split(",G:")[0];
        return parseDouble(result);
    }

    @Override
    public double setP12(String someStr) {
        String result;
        result = someStr.split("C:")[2].split(",G:")[0];
        return parseDouble(result);
    }
    @Override
    public double setP2X(String someStr) {
        String result;
        result = someStr.split("C:")[3].split(",G:")[0];
        return parseDouble(result);
    }
//endregion
    //region bothGoal
    @Override
    public double setBothGoalYes(String someStr) {
        String result;
        result = someStr.split("C:")[1].split(",G:")[0];
        return parseDouble(result);
    }

    @Override
    public double setBothGoalNo(String someStr) {
        String result;
        result = someStr.split("C:")[2].split(",G:")[0];
        return parseDouble(result);
    }
//endregion
    //region fora
    @Override
    public double setFora(String someStr, String findForaRegex) {
        for (int i = 0; i < someStr.split("},\\{").length; i++){
            if(someStr.split("},\\{")[i].split("P:" + findForaRegex).length > 1)
                return parseDouble(someStr.split("},\\{")[i].split("C:")[1].split(",")[0]);
        }
        return 0;
    }


    //endregion
    //region total
    @Override
    public double setTotal(String someStr, String findTotalRegex) {
        for (int i = 0; i < someStr.split("},\\{").length; i++){
            if(someStr.split("},\\{")[i].split(findTotalRegex).length > 1)
                return parseDouble(someStr.split("},\\{")[i].split("C:")[1].split(",")[0]);
        }
        return 0;
    }

//endregion


}
