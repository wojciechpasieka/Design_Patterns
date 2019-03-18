package Strategy;

public class mainStrategy {



    public static void main(String[] args) {

        Product product = new Product(200);

        RegularPrice regularPrice = new RegularPrice();
        SalePrice salePrice = new SalePrice();

        product.setPriceStrategy(regularPrice);
        product.setPriceStrategy(salePrice);
        product.setPrice();


    }

}
