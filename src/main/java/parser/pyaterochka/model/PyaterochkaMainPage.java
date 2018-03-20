package parser.pyaterochka.model;


import java.util.ArrayList;
import java.util.List;

public class PyaterochkaMainPage {
    private int count;
    private String next;
    private String previous;

    private List<Product> results = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Product> getResults() {
        return results;
    }

    public void setResults(List<Product> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "MainPage{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }

    public void addProduct(Product product) {
        results.add(product);
    }
}
