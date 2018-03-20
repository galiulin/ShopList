package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.ShopitemCategories;

import java.lang.reflect.Type;

public class ShopitemCategoriesDeserializer implements JsonDeserializer<ShopitemCategories> {
    @Override
    public ShopitemCategories deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject shopitemJson = json.getAsJsonObject();
        ShopitemCategories result = new ShopitemCategories();
        result.setId(shopitemJson.get("id").getAsInt());
        result.setName(shopitemJson.get("name").getAsString());
        result.setSpecialOffers(shopitemJson.get("special_offers").getAsInt());
        return result;
    }
}
