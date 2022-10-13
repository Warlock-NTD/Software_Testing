import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    // Phan tich gia tri bien
    @Test
    void ticketPayCalculate() {
        assertEquals(240.0, Ticket.ticketPayCalculate(3, 20));
        assertEquals(300.0, Ticket.ticketPayCalculate(3, 0));
        assertEquals(180.0, Ticket.ticketPayCalculate(3, 40));
        assertEquals(180.3, Ticket.ticketPayCalculate(3, 39.9));
        assertEquals(299.7, Ticket.ticketPayCalculate(3, 0.1));
        assertEquals(80.0, Ticket.ticketPayCalculate(1, 20));
        assertEquals(400.0, Ticket.ticketPayCalculate(5, 20));
        assertEquals(392.00000000000006, Ticket.ticketPayCalculate(4.9, 20));
        assertEquals(88.00000000000001, Ticket.ticketPayCalculate(1.1, 20));
    }

    @Test
    void testTicketPayCalculate() {
        assertEquals(240.0, Ticket.ticketPayCalculate(3, 20));
        assertEquals(-1, Ticket.ticketPayCalculate(3, 60));
        assertEquals(-1, Ticket.ticketPayCalculate(6, 20));
        assertEquals(-1, Ticket.ticketPayCalculate(0, -10));
    }

    // Phan hoach tuong duong

}