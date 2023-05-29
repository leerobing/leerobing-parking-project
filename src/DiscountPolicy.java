public abstract class DiscountPolicy {

    public Ticket calculateDiscountAmount(Ticket ticket) {
            Ticket discountTicket = getDiscountAmount(ticket);
            return discountTicket;
    }
    abstract protected Ticket getDiscountAmount(Ticket ticket); //템플릿 메서드
}
