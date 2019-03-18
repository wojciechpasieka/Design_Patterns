package builder;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private Integer price;

    public FlightLeg(FlightBuilder flightBuilder){
        from = flightBuilder.from;
        to = flightBuilder.to;
        delayed = flightBuilder.delayed;
        price = flightBuilder.price;


    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightBuilder{
        private String from;
        private String to;
        private boolean delayed = false;
        private Integer price;

        public FlightBuilder() {
            delayed = false;
        }

        public FlightBuilder from(String from){
            this.from = from;
            return this;
        }

        public FlightBuilder to(String to){
            this.to = to;
            return this;
        }

        public FlightBuilder delayed(boolean delayed){
            this.delayed = delayed;
            return this;
        }

        public FlightBuilder price (Integer price){
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            if (this.price == null){
                throw new IllegalStateException();
            }

            return new FlightLeg(this);
        }

    }
}
