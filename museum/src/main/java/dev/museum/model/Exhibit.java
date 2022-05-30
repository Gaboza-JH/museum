package dev.museum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exhibit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "State", nullable = false)
	private String state;
	@Column(name = "Era", nullable = false)
	private String era;
	@Column(name = "Floor", nullable = false)
	private String floor;
	
	public Exhibit() {}
	
	public Exhibit(String name) {
		this.name = name;
	}
	
	public Exhibit(Long id, String name, String state, String era, String floor) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.era = era;
		this.floor = floor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
		
}


