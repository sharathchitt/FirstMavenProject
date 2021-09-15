package com.lti.model;

public class Flight implements Comparable<Flight> {
	private int flightID;
	private String source;
	private String destination;
	
	public Flight(int flightID, String source, String destination) {
		
		this.flightID = flightID;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int compareTo(Flight o) {
		
		if(this.flightID>o.flightID)
			return 1;
		else if(this.flightID<o.flightID)
			return -1;
		else
			return 0;
		
	}
	
	
	
}
