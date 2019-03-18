package Strategy;

public class RegularPrice implements PriceStrategy {

    public void calculatePrice(Integer price) {
        System.out.println(price);
    }
}
