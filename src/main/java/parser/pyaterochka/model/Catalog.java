package parser.pyaterochka.model;

public class Catalog {
    private int id;
    private String name;
    private long date_start;
    private long date_end;
    private String type;
    private String terms;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_start=" + date_start +
                ", date_end=" + date_end +
                ", type='" + type + '\'' +
                ", terms='" + terms + '\'' +
                '}';
    }
}
