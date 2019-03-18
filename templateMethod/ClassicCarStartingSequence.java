package templateMethod;

public abstract class ClassicCarStartingSequence {
    public void startTheCar(){

        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Jedź");
    }

    private void setTheGear() {
        System.out.println("Ustaw bieg");
    }

    private void startTheIgnition() {
        System.out.println("Przekrec kluczyk");
    }

    private void fastenSeatBelts() {
        System.out.println("Zapnij pasy");
    }

}
