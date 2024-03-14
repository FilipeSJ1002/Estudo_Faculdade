package Daniel;

public class ProductCart {

    private int id;
    private float price;
    private String name;

    public ProductCart() {
    }

    public ProductCart(int id, float price, String name) {
        this.setId(id);
        this.setPrice(price);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
    	return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name=" + name 
                + " }";
    }
}
