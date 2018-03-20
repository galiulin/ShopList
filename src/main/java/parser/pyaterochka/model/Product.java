package parser.pyaterochka.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String description;
    private String image_big;
    private String image_small;
    private String name;
    private Params params;
    private int position;
    private List<ShopItem> shop_items = new ArrayList<>();
    private List<ShopitemCategories> shopitem_categories = new ArrayList<>();
    private String terms;
    private TermsType terms_type;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_big() {
        return image_big;
    }

    public void setImage_big(String image_big) {
        this.image_big = image_big;
    }

    public String getImage_small() {
        return image_small;
    }

    public void setImage_small(String image_small) {
        this.image_small = image_small;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<ShopItem> getShop_items() {
        return shop_items;
    }

    public void setShop_items(List<ShopItem> shop_items) {
        this.shop_items = shop_items;
    }

    public void addShopItem(ShopItem shop_item) {
        this.shop_items.add(shop_item);
    }

    public List<ShopitemCategories> getShopitem_categories() {
        return shopitem_categories;
    }

    public void setShopitem_categories(List<ShopitemCategories> shopitems) {
        this.shopitem_categories = shopitems;
    }

    public void addShopitemCategories(ShopitemCategories shopitem_categorie){
        this.shopitem_categories.add(shopitem_categorie);
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public TermsType getTerms_type() {
        return terms_type;
    }

    public void setTerms_type(TermsType terms_type) {
        this.terms_type = terms_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", image_big='" + image_big + '\'' +
                ", image_small='" + image_small + '\'' +
                ", name='" + name + '\'' +
                ", params=" + params +
                ", position=" + position +
                ", shop_items=" + shop_items +
                ", shopitem_categories=" + shopitem_categories +
                ", terms='" + terms + '\'' +
                ", terms_type='" + terms_type + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
