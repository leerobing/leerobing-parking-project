public class TwoFloorTicket extends TicketDecorator{
    public TwoFloorTicket(TicketInterface ticket, String parkingLotFloor) {
        super(ticket, parkingLotFloor);
    }

    @Override
    public String toString() {
        return  super.ticket + ",{" + super.parkingLotFloor+ "}";
    }
}
