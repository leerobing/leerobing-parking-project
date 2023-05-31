public class Customer {
    private Car car;
    private Wallet wallet;
    private TicketInterface ticket;
    private Registration registration;

    private Customer() {

    }

    private Customer(Car car, Wallet wallet, Ticket ticket,Registration registration) {
        this.car = car;
        this.wallet = wallet;
        this.ticket = ticket;
        this.registration = registration;
    }

    public static Customer of(Car car, Wallet wallet, Ticket ticket,Registration registration) {
        return new Customer(car,wallet,ticket,registration);
    }

    public Long parkingSpotConfirmationRequest (Employee employee) {
        return employee.checkParkingSpotRequest();
    }

    public Registration showRegistration() {
        return registration;
    }
    public void ticketPurchase(Employee employee) {
      this.ticket = employee.ticketSales(showRegistration());
      wallet.minusAmount(ticket.showTicketPrice());
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
