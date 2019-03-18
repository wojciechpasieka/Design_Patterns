package templateMethod;

public abstract class WorkDay {

    private TypeOfTransport typeOfTransport;

    public WorkDay(TypeOfTransport typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public final void workDay(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
    }

    private void work() {
    }

    private void summary(int time) {
        System.out.println("Czas dojazdu zajął mi: " + time + " godzin");
    }

    private int goToWork(TypeOfTransport typeOfTransport) {
        int time;
        switch (typeOfTransport) {
            case CAR:

                time = 1;
                break;
            case BIKE:
                time = 3;
                break;
            case TRAM:
                time = 2;
                break;
            default:time = 0;
        }

        return time;
    }

    private void getReady() {
        System.out.println("Ubierz się i bądź gotowy");
    }

    private void wakeUp() {
        System.out.println("Czas wstać ");
    }
}
