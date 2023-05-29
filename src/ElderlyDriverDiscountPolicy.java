
public class ElderlyDriverDiscountPolicy extends DiscountPolicy {
    @Override
    protected Ticket getDiscountAmount(Ticket ticket) {
        return ticket.discountTicketPrice(5000L);
    }
}
