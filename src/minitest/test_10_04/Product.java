package minitest.test_10_04;

public class Product {
    private String code;
    private String name;
    private double price;
    private String type;
    public final static String MONEY = "USD";

    public Product() {
    }

    public Product(String code, String name, double price, String type) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + MONEY +
                ", type='" + type + '\'' +
                '}';
    }
}
