/**
* @description Iterator implementation
* @author Arun
* @version 1.0
*/
package com.arun.doors.model;

import java.util.ArrayList;
import java.util.List;

import com.arun.doors.service.Container;
import com.arun.doors.service.Iterator;

public class DoorsIteratorImpl implements Container {
	private String[] doors;
	private Doors doorsObj;

	public DoorsIteratorImpl(String[] doors) {
		doorsObj = new Doors(doors);
		this.doors = doors;
	}

	public Iterator getIterator() {
		return new CollectionofDoorIterate();
	}

	private class CollectionofDoorIterate implements Iterator {
		int i;

		public boolean hasNext() {
			if (i < doors.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return doors[i++];
			}
			return null;
		}
	}

	public void getClosedDoors() {
		/**
		 * Null check is not available in current code but we can use Optional
		 * so null check won't be required.
		 */
		List<Integer> list = doorsObj.closedDoors();
		for (Integer value : list)
			System.out.print(value + ", ");
	}

	public void getOpenDoors() {
		/**
		 * Null check is not available in current code but we can use Optional
		 * so null check won't be required.
		 */			
		List<Integer> list = doorsObj.openDoors();
		for (Integer value : list)
			System.out.print(value + ", ");
	}

	/**
	 * You make 100 passes by the doors, in following way : The first time
	 * through, you visit every door and toggle the door. The second time you
	 * only visit every 2nd door (door #2, #4, #6, ...) The third time, every
	 * 3rd door(door #3, #6, #9, ...),etc... until you only visit the 100th
	 * door.
	 * 
	 */
	public List<String> stateAfterLastPass() {
		List<String> doorList = new ArrayList<>();
		for (Iterator iter = this.getIterator(); iter.hasNext();) {
			doorList.add((iter.next()).toString());
		}
		return doorList;
	}
}
