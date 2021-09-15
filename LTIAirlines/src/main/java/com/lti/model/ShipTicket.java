package com.lti.model;

public class ShipTicket {
	
	int shipID;
	String shipName;
	int capacity;
	
	
	public ShipTicket(int shipID, String shipName, int capacity) {
		super();
		this.shipID = shipID;
		this.shipName = shipName;
		this.capacity = capacity;
	}


	public int getShipID() {
		return shipID;
	}


	public void setShipID(int shipID) {
		this.shipID = shipID;
	}


	public String getShipName() {
		return shipName;
	}


	public void setShipName(String shipName) {
		this.shipName = shipName;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	

}
