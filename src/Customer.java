public class Customer {
    private Car car;
    private Wallet wallet;
    private Ticket ticket;
    private Customer() {

    }

    public Customer(Car car, Wallet wallet, Ticket ticket) {
        this.car = car;
        this.wallet = wallet;
        this.ticket = ticket;
    }

    public Long parkingSpotConfirmationRequest (Employee employee) {
        return employee.checkParkingSpotRequest();
    }

    public Ticket ticketPurchase(Employee employee) {
        return employee.ticketSales();
    }
}
