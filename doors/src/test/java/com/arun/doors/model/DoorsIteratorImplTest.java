package com.arun.doors.model;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.arun.doors.constants.DoorsConstants;

public class DoorsIteratorImplTest {

	DoorsIteratorImpl doorsIteratorImpl;

	@Before
	public void init() {
		String[] door = new String[100];
		doorsIteratorImpl = new DoorsIteratorImpl(door);
	}

	@Test
	public void testGetIterator() {
		Assert.assertNotNull(doorsIteratorImpl.getIterator());
	}

	@Test
	public void testStateAfterastPass() {
		int openDoor = 1, closedDoor = 99;
		List<String> list = doorsIteratorImpl.stateAfterLastPass();
		Assert.assertEquals(DoorsConstants.STATUS_OPENED.getStatus(), list.get(openDoor - 1));
		Assert.assertEquals(DoorsConstants.STATUS_CLOSED.getStatus(), list.get(closedDoor - 1));
	}
}
