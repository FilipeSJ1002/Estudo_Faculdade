package Daniel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	 private int id;
	    private float totalPrice;
	    private List<CarItem> carItens;

	    public ShoppingCart() {
	        this.carItens = new ArrayList<CarItem>();
	    }

	    public ShoppingCart(int id, float totalPrice) {
	        this.setId(id);
	        this.setTotalPrice(totalPrice);
	        this.carItens = new ArrayList<CarItem>();
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public float getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(float totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    public List<CarItem> getCarItens() {
	        return carItens;
	    }

	    public void setCarItens(List<CarItem> carItens) {
	        this.carItens = carItens;
	    }

	    public void addCarItem(int id, int quantity, ProductCart product){
	        this.carItens.add(new CarItem(id, quantity, product));
	        calculateTotalPrice();
	    }


	    public void calculateTotalPrice(){
	        this.totalPrice = 0;
	        for(CarItem item: carItens){
	            this.totalPrice += item.getQuantity() * item.getProduct().getPrice(); // CORRIJA O ERRO AQUI
	        }
	    }

	    public String toString() {
	        return "ShoppingCart{" +
	                "id=" + id +
	                ", totalPrice=" + totalPrice +
	                ", carItens=" + carItens +
	                '}';
	    }	
}
