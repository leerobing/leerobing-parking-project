public class DisabledDriver extends DiscountPolicy {
    @Override
    protected Ticket getDiscountAmount(Ticket ticket) { // 장애인 운전자 할인정핵
        return ticket.discountTicketPrice(3000L);
    }
}
