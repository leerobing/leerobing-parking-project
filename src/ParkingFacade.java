public class ParkingFacade {

    private Customer customer;
    private DisabledDriver discountPolicy;
    private ParkingLot parkingLot;
    private Employee employee;

    public ParkingFacade(){}

    public ParkingFacade(Customer customer, DiscountPolicy discountPolicy, ParkingLot parkingLot,Employee employee) {
        this.customer = customer;
        this.discountPolicy = (DisabledDriver) discountPolicy;
        this.parkingLot = parkingLot;
        this.employee = employee;
    }

    public void test() {
      customer.ticketPurchase(employee);
        System.out.println(customer);
    }


}
