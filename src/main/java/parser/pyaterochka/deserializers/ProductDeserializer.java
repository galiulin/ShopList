package parser.pyaterochka.deserializers;

import com.google.gson.*;
import parser.pyaterochka.model.*;

import java.lang.reflect.Type;

public class ProductDeserializer implements JsonDeserializer<Product> {
    @Override
    public Product deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        final JsonObject productObject = json.getAsJsonObject();
        Product product = new Product();
        product.setId(productObject.get("id").getAsInt());
        product.setDescription(productObject.get("description").getAsString());
        product.setImage_big(productObject.get("image_big").getAsString());
        product.setImage_small(productObject.get("image_small").getAsString());
        product.setName(productObject.get("name").getAsString());

        JsonElement paramsJson = productObject.get("params");
        product.setParams(context.deserialize(paramsJson, Params.class));

        product.setPosition(productObject.get("position").getAsInt());

        JsonArray shopitemsJsonArr = productObject.get("shop_items").getAsJsonArray();
        shopitemsJsonArr.forEach((element) ->
                product.addShopItem(
                        context.deserialize(element, ShopItem.class)));

        JsonArray shopitemCategoriesJsonArr = productObject.get("shopitem_categories")
                .getAsJsonArray();

        shopitemCategoriesJsonArr.forEach((element) ->
                product.addShopitemCategories(
                        context.deserialize(element, ShopitemCategories.class)));

        product.setTerms(productObject.get("terms").getAsString());

        JsonElement terms_type = productObject.get("terms_type");
        if (!terms_type.isJsonNull()){
            product.setTerms_type(context.deserialize(terms_type, TermsType.class));
        }

        product.setType(productObject.get("type").getAsString());

        return product;
    }
}
