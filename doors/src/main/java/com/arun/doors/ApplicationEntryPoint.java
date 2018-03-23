/**
* @description ApplicationEntryPoint
* @author Arun
* @version 1.0
*/
package com.arun.doors;

import java.util.InputMismatchException;

/*
 * importing packages
 * 
 * */
import org.apache.log4j.Logger;

import com.arun.doors.model.DoorsIteratorImpl;


public class ApplicationEntryPoint {

	private static Logger logger = Logger.getLogger(ApplicationEntryPoint.class);

	public void execute() {

		String[] doors = new String[100];
		int i = 1;
		DoorsIteratorImpl doorsIterator = null;
		try {
			doorsIterator = new DoorsIteratorImpl(doors);
		} catch (InputMismatchException ex) {
			logger.error(ex);
			System.out.println("Required String Array");
			System.exit(0);
		}

		System.out.println("State of the doors in after the last pass");
		for (String status : doorsIterator.stateAfterLastPass()) {
			System.out.println("Door " + i + ":" + status);
			i++;
		}

		System.out.println("List of Open Doors :");
		doorsIterator.getOpenDoors();

		System.out.println("\nList of Closed Doors :");
		doorsIterator.getClosedDoors();
	}

}