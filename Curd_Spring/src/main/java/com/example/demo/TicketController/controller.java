 package com.example.demo.TicketController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Ticket;
import com.example.demo.Service.TicketSer;


@RestController
@RequestMapping("/cust")
public class controller {
	@Autowired
	TicketSer cum;
	
	@PostMapping("")
	public String create(@RequestBody Ticket abc)
	{
		return cum.addCustomer(abc);
	}
	@GetMapping("")
	public List<Ticket> read()
	{
		return cum.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<Ticket>readById(@PathVariable int id)
	{
		return cum.getCustomerById(id);
	}
	@PutMapping("/drf")
	public String update(@RequestBody Ticket cus)
	{
		return cum.updateCustomer(cus);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("ced") int id)
	{
		 cum.deleteRequestParam(id);
		 return "delete";
		
	}
	


}
