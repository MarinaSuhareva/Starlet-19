package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;


public class TicketRepositoryTest {

    TicketRepository repository = new TicketRepository();
    Ticket ticket1 = new Ticket(001, 8010, "KEJ", "VKO", 275);
    Ticket ticket2 = new Ticket(002, 7340, "OVB", "SVO", 250);
    Ticket ticket3 = new Ticket(003, 9950, "OVB", "SVO", 240);
    Ticket ticket4 = new Ticket(004, 22310, "OVB", "VVO", 770);
    Ticket ticket5 = new Ticket(005, 6950, "KEJ", "AER", 330);
    Ticket ticket6 = new Ticket(006, 7864, "OVB", "DMV", 260);
    Ticket ticket7 = new Ticket(007, 7864, "OVB", "DMV", 260);

    @Test
    public void getAllTicket() {
        repository.save(ticket1);
        repository.save(ticket2);
        repository.save(ticket3);
        repository.save(ticket4);
        repository.save(ticket5);
        repository.save(ticket6);
        repository.save(ticket7);

        Ticket[] actual = repository.getAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Assertions.assertArrayEquals(expected, actual);


    }


    @Test
    public void removeByIdTicket() {
        repository.save(ticket1);
        repository.save(ticket2);
        repository.save(ticket3);
        repository.save(ticket4);
        repository.save(ticket5);
        repository.save(ticket6);
        repository.save(ticket7);


        repository.removeById(4);

        Ticket[] actual = repository.getAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket5, ticket6, ticket7};
        Assertions.assertArrayEquals(expected, actual);

    }

}
