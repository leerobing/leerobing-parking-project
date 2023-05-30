
public class ElderlyDriverDiscountPolicy extends DiscountPolicy { //노약자 운전자 할인정책
    @Override
    protected Ticket getDiscountAmount(Ticket ticket) {
        return ticket.discountTicketPrice(5000L);
    }
}
