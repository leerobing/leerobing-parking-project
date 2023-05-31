public class TicketOffice {

    private DiscountPolicy discountPolicy;
    public TicketOffice(){};
    public TicketOffice (DiscountPolicy discountPolicy ) {
        this.discountPolicy = discountPolicy;
    }
    public Ticket getTicket(Registration registration) {
        Ticket ticket =  Ticket.of(10000L,"입장허용");
        if (registration.checkRegistration() != 0L)
        discountPolicy.calculateDiscountAmount(ticket);
        return ticket;
    }

    public TicketInterface getOneFloorTicket(Ticket ticket) {
        TicketInterface ticketInterface = new OneFloorTicket(ticket,"1층 주차장");
        return ticketInterface;
    }
    public TicketInterface getTwoFloorTicket(Ticket ticket) {
        TicketInterface ticketInterface = new TwoFloorTicket(ticket,"2층 주차장");
        return ticketInterface;
    }



    public Ticket getWaitTicket() {
        return Ticket.of(0L, "잠시 대기");
    }

}
