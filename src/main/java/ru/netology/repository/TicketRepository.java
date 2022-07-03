package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];


    public void save(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }


    public Ticket[] getAll() {
        return tickets;
    }

    public void removeById(int id) {

        Ticket[] tmp = new Ticket[tickets.length - 1];
        int Index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[Index] = ticket;
                Index++;
            }
        }
        tickets = tmp;
    }

}




