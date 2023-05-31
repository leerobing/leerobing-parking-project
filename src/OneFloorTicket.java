public class OneFloorTicket extends TicketDecorator{
    public OneFloorTicket(TicketInterface ticketInterface, String parkingLotFloor){
        super(ticketInterface,parkingLotFloor);
    }
    @Override
    public String toString() {
        return  super.ticket +
                ",{" + super.parkingLotFloor+ "}";
    }
}
