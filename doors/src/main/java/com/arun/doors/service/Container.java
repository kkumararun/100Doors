/**
* @description Container Interface to 
* 		implement Iterator Pattern
* @author Arun
* @version 1.0
*/
package com.arun.doors.service;

public interface Container {
	
	public Iterator getIterator();

	public void getClosedDoors();

	public void getOpenDoors();
}
