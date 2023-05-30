public class Ticket {
    private Long price;
    private String type;
    public Ticket() {}
    private Ticket(Long price, String type) {
        this.price = price;
        this.type = type;
    }

    public Ticket discountTicketPrice(Long discountPrice) {
        this.price -= discountPrice;
        return this;
    }

    public Long showTicketPrice() {
        return this.price;
    }

    public static Ticket of(Long price, String type) {
        return new Ticket(price,type);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
