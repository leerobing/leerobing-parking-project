public class Employee {

    //주차장 객체
    private ParkingLot parkingLot;
    //주차권매표소 객체
    private TicketOffice ticketOffice;
    public Employee(){};
    public Employee(ParkingLot parkingLot, TicketOffice ticketOffice) {
        this.parkingLot = parkingLot;
        this.ticketOffice = ticketOffice;
    }

    //주차 자리 확인 메서드
    public Long checkParkingSpotRequest() {
        return parkingLot.checkParkingSpot();
    }
    //주차권 판매 메서드
    public TicketInterface ticketSales(Registration registration) {
        if (checkParkingSpotRequest() != 0L) {
            Ticket ticket = ticketOffice.getTicket(registration);
            if (parkingLot.checkParkFloor() == 1L) {
                return ticketOffice.getOneFloorTicket(ticket);
            } else if (parkingLot.checkParkFloor() == 2L) {
                return ticketOffice.getTwoFloorTicket(ticket);
            }
        }
        return ticketOffice.getWaitTicket();
    }


}
