import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class OutPutScore  {
    private static Document page;
    private static String leftTeams;
    private static String rightTeams;
    private static String center;

    public static void outputMatches() throws IOException {

        page = Parser.getPageBookmakersLive();
        Element tableFootball = page.select("div[class=grid-padding-20-15 _Sportbox_Spb2015_Components_TopResultsBlock_TopResultsBlock").first();
        Element temp = tableFootball.select("div[class=row]").first();

        Elements matches = temp.select("div[class=col-lg-6 col-md-6 col-sm-6 col-xs-12]");

        for (Element match : matches) {
            String bk = match.select("div[class=games").text();
            leftTeams = match.select("div[class=box-left").text();
            rightTeams = match.select("div[class=box-right").text();
            center = match.select("div[class=box-center").text();
            System.out.println(leftTeams + " - " + rightTeams);
            System.out.println("Счет : " + center);
            System.out.println();

        }

    }
}





