public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    public double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(String passengerName, String startLocation, String destination,
                      double price, double duration, double speed) {
        super(passengerName, startLocation, destination, price);
        this.duration = duration;
        this.speed = speed;
    }

    // Method to check taxi status
    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // Method to display estimated travel duration
    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // Method to slow down the taxi
    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    // [ lanjutan dari kode diatas ]

    // Method to speed up the taxi
    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    // Method to display basic info passenger and trip
    @Override
    public void displayInfo() {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination : " + destination);
        System.out.println("Price : " + price);
        calculateFinalPrice();
    }

    private void calculateFinalPrice() {
        System.out.println("Final Price : " + (price + (price * TAX_RATE))); // Price including 10% tax
    }

    // Method to display full info including duration and speed
    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration : " + duration + " minutes");
        System.out.println("Speed : " + speed + " km/h");
    }

}
