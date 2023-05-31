public class TicketDecorator implements TicketInterface{
    
    protected TicketInterface ticket;
    protected String parkingLotFloor;


    public TicketDecorator(TicketInterface ticket,String parkingLotFloor) {
        this.ticket = ticket;
        this.parkingLotFloor = parkingLotFloor;
    }

    @Override
    public Ticket discountTicketPrice(Long discountPrice) {
        return  ticket.discountTicketPrice(discountPrice);
    }

    @Override
    public Long showTicketPrice() {
        return ticket.showTicketPrice();
    }
}
