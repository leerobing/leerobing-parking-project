public class Main {
    public static void main(String[] args) {

        Car car = new Car
                .Builder()
                .setCarModel("bmw")
                .setCarType("승용차")
                .setCarNumber("서울 가1245")
                .build();

        System.out.println(car);
        DisabledDriver discountPolicy = new DisabledDriver();
        TicketOffice ticketOffice = new TicketOffice(discountPolicy);
        ParkingLot parkingLot = new ParkingLot();
        Employee employee = new Employee(parkingLot,ticketOffice);
        Wallet wallet = new Wallet(1000L);
        Ticket ticket = new Ticket();
        Registration registration = new Registration(1L);
        registration.check();
        Customer customer = new Customer(car,wallet,ticket,registration);
        customer.ticketPurchase(employee,customer.showRegistration());
        System.out.println(customer);


    }
}