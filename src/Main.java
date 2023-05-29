public class Main {
    public static void main(String[] args) {

        Car car = new Car
                .Builder()
                .setCarModel("bmw")
                .setCarType("승용차")
                .setCarNumber("서울 가1245")
                .build();

        System.out.println(car);

        Wallet wallet = new Wallet(1000L);
        Ticket ticket = new Ticket();
        Customer customer = new Customer(car,wallet,ticket);


    }
}