package com.arun.doors.constants;

public enum DoorsConstants {
	
	STATUS_CLOSED ("closed"),
	STATUS_OPENED ("opened");

	String status;
	
	DoorsConstants(String status){
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}
}
