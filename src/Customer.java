public class Customer {
    private Car car;
    private Wallet wallet;
    private Ticket ticket;
    private Registration registration;

    private Customer() {

    }


    public Customer(Car car, Wallet wallet, Ticket ticket,Registration registration) {
        this.car = car;
        this.wallet = wallet;
        this.ticket = ticket;
        this.registration = registration;
    }

    public Long parkingSpotConfirmationRequest (Employee employee) {
        return employee.checkParkingSpotRequest();
    }

    public Registration showRegistration() {
        return registration;
    }
    public void ticketPurchase(Employee employee,Registration registration) {
      this.ticket = employee.ticketSales(showRegistration());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "car=" + car +
                ", wallet=" + wallet +
                ", ticket=" + ticket +
                ", registration=" + registration +
                '}';
    }
}
