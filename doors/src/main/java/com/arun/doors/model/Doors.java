/**
* @description Doors
* @author Arun
* @version 1.0
*/
package com.arun.doors.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arun.doors.constants.DoorsConstants;

public class Doors {

	private String[] door;

	/**
	 * creates doors in a row of a specified size and are all initially closed.
	 */
	public Doors(String[] doors) {
		this.door = doors;
		Arrays.fill(door, DoorsConstants.STATUS_CLOSED.getStatus());
		int step = 1;
		while (step <= 100) {
			for (int i = step - 1; i < door.length; i += step) {
				door[i] = Doors.toggle(door[i]);
			}
			step++;
		}

	}

	/**
	 * get states for all closed doors.
	 * 
	 */
	public List<Integer> closedDoors() {
		List<Integer> closeDoors = new ArrayList<>();
		for (int i = 0; i < door.length; i++) {
			if (door[i].equals(DoorsConstants.STATUS_CLOSED.getStatus())) {
				closeDoors.add(i + 1);
			}
		}
		return closeDoors;
	}

	/**
	 * get states for all open doors.
	 * 
	 */
	public List<Integer> openDoors() {
		List<Integer> openDoors = new ArrayList<>();
		for (int i = 0; i < door.length; i++) {
			if (door[i].equals(DoorsConstants.STATUS_OPENED.getStatus())) {
				openDoors.add(i + 1);
			}
		}
		return openDoors;
	}

	/**
	 * get states for all doors.
	 * 
	 * @return state
	 */

	public static String toggle(String item) {
		if (item.equals(DoorsConstants.STATUS_CLOSED.getStatus())) {
			return DoorsConstants.STATUS_OPENED.getStatus();
		} else {
			return DoorsConstants.STATUS_CLOSED.getStatus();
		}
	}
}
