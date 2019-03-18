package Strategy;

public class Product {

    int price;
    PriceStrategy priceStrategy;


    public Product(int price) {
        this.price = price;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    public void setPrice(){
        priceStrategy.calculatePrice(price);
    }
}
