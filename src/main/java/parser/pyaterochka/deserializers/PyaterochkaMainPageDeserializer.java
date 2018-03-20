package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class PyaterochkaMainPageDeserializer implements JsonDeserializer<PyaterochkaMainPage> {

    @Override
    public PyaterochkaMainPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {

        PyaterochkaMainPage mainPage = new PyaterochkaMainPage();

        if (!jsonElement.isJsonNull() && jsonElement.isJsonObject()) {
            JsonObject o = jsonElement.getAsJsonObject();
            if (!o.get("count").isJsonNull()) {
                mainPage.setCount(o.get("count").getAsInt());
            }
            if (!o.get("next").isJsonNull()) {
                mainPage.setNext(o.get("next").getAsString());
            }
            if (!o.get("previous").isJsonNull()) {
                mainPage.setPrevious(o.get("previous").getAsString());
            }
            JsonArray results = o.get("results").getAsJsonArray();
            for (JsonElement result : results) {
                mainPage.addProduct((Product) context.deserialize(result, Product.class));
            }
        }
        return mainPage;
    }
}
