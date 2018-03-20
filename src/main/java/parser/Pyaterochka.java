package parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import parser.pyaterochka.deserializers.*;
import parser.pyaterochka.model.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Pyaterochka {
    private static String url = "https://5ka.ru/api/special_offers/?records_per_page=1000&page=1&all_prev=1";
    private static String userAgent =
            "User-Agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                    "AppleWebKit/537.36 (KHTML, like Gecko) " +
                    "Chrome/64.0.3282.186 Safari/537.36";


    /**получение соедиения к сайту*/
    private HttpURLConnection getConnection() throws IOException {
        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", userAgent);
        connection.setRequestProperty("Content-Type", "json");
        return connection;
    }

    /**получение содержимое страницы с товарами*/
    private String getPage() throws IOException {
        HttpURLConnection connection = getConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));
        StringBuffer response = new StringBuffer();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        connection.disconnect();

        return response.toString();
    }

    /**парсинг и извлечение контента со страницы*/
    public List<Product> getContent() throws ParseException {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PyaterochkaMainPage.class, new PyaterochkaMainPageDeserializer())
                .registerTypeAdapter(Product.class, new ProductDeserializer())
                .registerTypeAdapter(Params.class, new ParamsDeserializer())
                .registerTypeAdapter(Catalog.class, new CatalogDeserializer())
                .registerTypeAdapter(ShopItem.class, new ShopItemDeserializer())
                .registerTypeAdapter(ShopitemCategories.class, new ShopitemCategoriesDeserializer())
                .registerTypeAdapter(TermsType.class, new TermsTypeDeserializer())
                .create();
        String page;
        try {
            page = getPage();
        } catch (IOException e) {
            throw new ParseException();
        }

        if (page != null) {
            PyaterochkaMainPage mainPage = gson.fromJson(page, PyaterochkaMainPage.class);
            return mainPage.getResults();
        } else {
            throw new ParseException("по каким-то причинам page == null");
        }
    }
}
