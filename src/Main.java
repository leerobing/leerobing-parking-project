public class Main {
    public static void main(String[] args) {

        Car car = new Car
                .Builder()
                .setCarModel("bmw")
                .setCarType("승용차")
                .setCarNumber("서울 가1245")
                .build();

        DisabledDriver discountPolicy = new DisabledDriver();
        TicketOffice ticketOffice = new TicketOffice(discountPolicy);
        ParkingLot parkingLot = new ParkingLot();
        Employee employee = new Employee(parkingLot,ticketOffice);
        Wallet wallet = new Wallet(10000L);
        Ticket ticket = new Ticket();
        Registration registration = new Registration(1L);
        Customer customer = Customer.of(car,wallet,ticket,registration);
        ParkingFacade parkingFacade = new ParkingFacade(customer,discountPolicy,parkingLot,employee);
        parkingFacade.test();


    }
}