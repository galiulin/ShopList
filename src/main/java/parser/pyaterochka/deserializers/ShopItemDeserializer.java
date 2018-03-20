package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.ShopItem;

import java.lang.reflect.Type;

public class ShopItemDeserializer implements JsonDeserializer<ShopItem> {
    @Override
    public ShopItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject shopitemJson = json.getAsJsonObject();
        ShopItem shopitem = new ShopItem();
        shopitem.setId(shopitemJson.get("id").getAsInt());
        if (!shopitemJson.get("name").isJsonNull()) {
            shopitem.setName(shopitemJson.get("name").getAsString());
        }
        shopitem.setPlu(shopitemJson.get("plu").getAsString());
        return shopitem;
    }
}
