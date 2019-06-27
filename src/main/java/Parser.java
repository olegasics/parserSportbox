import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.URL;

public class Parser {

    public static Document getPageBookmakersLive() throws IOException {
        for(;;) {
            String url = "https://news.sportbox.ru";
            Document pageLive = Jsoup.parse(new URL(url), 30000);

            return pageLive;
        }



    }

}
