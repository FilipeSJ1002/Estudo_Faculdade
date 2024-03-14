package Daniel;

public class CarItem {

	 private int id, quantity;
	 
	    ProductCart product;

	    public CarItem() {
	    }

	    public CarItem(int id, int quantity, ProductCart product) {
	        this.setId(id);
	        this.setQuantity(quantity);
	        this.setProduct(product);
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public ProductCart getProduct() {
	        return product;
	    }

	    public void setProduct(ProductCart product) {
	        this.product = product;
	    }

	    public String toString() {
	        return "CarItem{" +
	                "id=" + id +
	                ", quantity=" + quantity +
	                ", product=" + product +
	                '}';
	    }

	
}
