public class Ticket {
    private Long price;

    private String type;
    public Ticket() {}
    private Ticket(Long price, String type) {
        this.price = price;
        this.type = type;
    }

    public static Ticket of(Long price, String type) {
        return new Ticket(price,type);
    }
}
