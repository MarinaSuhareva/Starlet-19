package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int cost;
    private String fromAirport;
    private String toAirport;
    private int flightTime;


    @Override
    public int compareTo(Ticket otherTicket) {
        if (cost < otherTicket.cost) {
            return -1;
        }
        if (cost > otherTicket.cost) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id &&
                cost == ticket.cost
                && flightTime == ticket.flightTime
                && Objects.equals(fromAirport, ticket.fromAirport)
                && Objects.equals(toAirport, ticket.toAirport);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, cost, fromAirport, toAirport, flightTime);
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "cost=" + cost +
                '}';
    }

}

