public class DisabledDriver extends DiscountPolicy {
    @Override
    protected Ticket getDiscountAmount(Ticket ticket) {
        return ticket.discountTicketPrice(3000L);
    }
}
