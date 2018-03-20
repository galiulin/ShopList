package parser.pyaterochka.model;

public class Params {
    private int id;
    private String special_price;
    private String regular_price;
    private int discount_percent;
    private long date_start;
    private long date_end;
    private long special_offer;
    private Catalog catalog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecial_price() {
        return special_price;
    }

    public void setSpecial_price(String special_price) {
        this.special_price = special_price;
    }

    public String getRegular_price() {
        return regular_price;
    }

    public void setRegular_price(String regular_price) {
        this.regular_price = regular_price;
    }

    public int getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(int discount_percent) {
        this.discount_percent = discount_percent;
    }

    public long getDate_start() {
        return date_start;
    }

    public void setDate_start(long date_start) {
        this.date_start = date_start;
    }

    public long getDate_end() {
        return date_end;
    }

    public void setDate_end(long date_end) {
        this.date_end = date_end;
    }

    public long getSpecial_offer() {
        return special_offer;
    }

    public void setSpecial_offer(long special_offer) {
        this.special_offer = special_offer;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Params{" +
                "id=" + id +
                ", special_price='" + special_price + '\'' +
                ", regular_price='" + regular_price + '\'' +
                ", discount_percent=" + discount_percent +
                ", date_start=" + date_start +
                ", date_end=" + date_end +
                ", special_offer=" + special_offer +
                ", catalog=" + catalog +
                '}';
    }
}
