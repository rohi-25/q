package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Pojo.Ticket;
import com.example.demo.Repository.TicketRep;

@Service
public class TicketSer {
	@Autowired
	TicketRep repository;
	
	public String addCustomer(Ticket cus)
	{
		repository.save(cus);
		return "Added";  
		
		}
	public List<Ticket> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<Ticket> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Ticket abc)
	{
		repository.save(abc);
		return "Updated";
	}
	public void deleteRequestParam(int id) {
		
		repository.deleteById(id);
		
	}

}
