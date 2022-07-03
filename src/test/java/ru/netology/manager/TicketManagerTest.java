
package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketManager;
import ru.netology.repository.TicketRepository;


public class TicketManagerTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);
    Ticket ticket1 = new Ticket(001, 8010, "OVB", "SVO", 275);
    Ticket ticket2 = new Ticket(002, 7340, "OVB", "SVO", 250);
    Ticket ticket3 = new Ticket(003, 9950, "OVB", "SVO", 240);
    Ticket ticket4 = new Ticket(004, 22310, "OVB", "VVO", 770);
    Ticket ticket5 = new Ticket(005, 6950, "KEJ", "AER", 330);
    Ticket ticket6 = new Ticket(006, 7864, "OVB", "DMV", 260);
    Ticket ticket7 = new Ticket(007, 7864, "OVB", "DMV", 260);


    @Test
    public void FindATicketToTheDestination() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAlL("OVB", "SVO");
        Ticket[] expected = {ticket2, ticket1, ticket3};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findTheSameTicketByCost() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAlL("OVB", "DMV");
        Ticket[] expected = {ticket6, ticket7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindATicketToTheDestination2() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAlL("OVD", "SVO");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findAnExpensiveTicket() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAlL("OVB", "VVO");
        Ticket[] expected = {ticket4};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findACheapTicket() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAlL("KEJ", "AER");
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);
    }
}














