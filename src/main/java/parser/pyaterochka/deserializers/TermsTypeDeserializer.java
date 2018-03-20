package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.TermsType;

import java.lang.reflect.Type;

public class TermsTypeDeserializer implements JsonDeserializer<TermsType> {
    @Override
    public TermsType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject termsTypeJson = json.getAsJsonObject();
        TermsType termsType = new TermsType();
        termsType.setId(termsTypeJson.get("id").getAsInt());
        termsType.setName(termsTypeJson.get("name").getAsString());
        termsType.setDescription(termsTypeJson.get("description").getAsString());
        return termsType;
    }
}
