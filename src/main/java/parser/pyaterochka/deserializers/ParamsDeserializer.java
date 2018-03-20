package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.Catalog;
import parser.pyaterochka.model.Params;

import java.lang.reflect.Type;

public class ParamsDeserializer implements JsonDeserializer<Params> {
    @Override
    public Params deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject paramsJson = json.getAsJsonObject();

        Params params = new Params();

        params.setId(paramsJson.get("id").getAsInt());
        params.setSpecial_price(paramsJson.get("special_price").getAsString());
        params.setRegular_price(paramsJson.get("regular_price").getAsString());
        params.setDiscount_percent(paramsJson.get("discount_percent").getAsInt());
        params.setDate_start(paramsJson.get("discount_percent").getAsLong());
        params.setDate_end(paramsJson.get("date_end").getAsLong());
        params.setSpecial_offer(paramsJson.get("special_offer").getAsLong());

        JsonElement catalog = paramsJson.get("catalog");

        params.setCatalog(context.deserialize(catalog, Catalog.class));

        return params;
    }
}
