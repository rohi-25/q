package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Pojo.Ticket;

@Repository
public interface TicketRep extends JpaRepository<Ticket, Integer>{

}
