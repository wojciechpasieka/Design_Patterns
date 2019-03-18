package Strategy;

public class SalePrice implements PriceStrategy {

    public void calculatePrice(Integer price) {
        System.out.println(price * 0.5);
    }
}
