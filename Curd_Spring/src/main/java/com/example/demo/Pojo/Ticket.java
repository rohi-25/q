package com.example.demo.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	private int id;
	private String city;
	private String cinema;
	private String movie;
	private int date;
    private int time;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCinema() {
		return cinema;
	}

	public void setCinema(String cinema) {
		this.cinema = cinema;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", city=" + city + ", cinema=" + cinema + ", movie=" + movie + ", date=" + date
				+ ", time=" + time + "]";
	}
	
	}
	
	
	
    
	
    


