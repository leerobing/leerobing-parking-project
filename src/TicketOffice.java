public class TicketOffice {

    public Ticket getTicket() {
        return Ticket.of(10000L,"입장허용");
    }

    public Ticket getWaitTicket() {
        return Ticket.of(0L, "잠시 대기");
    }

}
