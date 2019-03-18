package builder;

public class MainApplication {
    public static void main(String[] args) {

        FlightLeg.FlightBuilder flightBuilder = new FlightLeg.FlightBuilder();
        FlightLeg flightLeg = flightBuilder
                .price(500)
                .from("Cracow")
                .to("Warsaw")
                .delayed(true)
                .build();

        System.out.println(flightLeg.toString());


    }
}
