public class Employee {

    //주차장 객체
    private ParkingLot parkingLot;

    //주차권매표소 객체
    private TicketOffice ticketOffice;

    //주차 자리 확인 메서드
    public Long checkParkingSpotRequest() {
        return parkingLot.checkParkingSpot();
    }

    public Ticket ticketSales() {
        return ticketOffice.getTicket();
    }



    //주차권 판매 메서드
}
