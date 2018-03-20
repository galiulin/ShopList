package parser.pyaterochka.model;

public class ShopitemCategories {
    private int id;
    private String name;
    private int special_offers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpecial_offers() {
        return special_offers;
    }

    public void setSpecialOffers(int special_offers) {
        this.special_offers = special_offers;
    }

    @Override
    public String toString() {
        return "ShopitemCategories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", special_offers=" + special_offers +
                '}';
    }
}
