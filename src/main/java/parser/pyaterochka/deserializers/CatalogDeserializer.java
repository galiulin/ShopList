package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.Catalog;

import java.lang.reflect.Type;

public class CatalogDeserializer implements JsonDeserializer<Catalog> {
    @Override
    public Catalog deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject catalogJson = json.getAsJsonObject();

        Catalog catalog = new Catalog();

        catalog.setId(catalogJson.get("id").getAsInt());
        catalog.setName(catalogJson.get("name").getAsString());
        catalog.setDate_start(catalogJson.get("date_start").getAsLong());
        catalog.setDate_end(catalogJson.get("date_end").getAsLong());
        catalog.setType(catalogJson.get("type").getAsString());
        catalog.setTerms(catalogJson.get("terms").getAsString());

        return catalog;
    }
}
