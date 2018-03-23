package com.arun.doors.model;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoorsTest {

	Doors doors;

	@Before
	public void init() {
		String[] door = new String[100];
		doors = new Doors(door);
	}

	@Test
	public void testOpenDoors() {
		List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
		List<Integer> actual = doors.openDoors();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testClosedDoors() {
		List<Integer> list = doors.closedDoors();
		Assert.assertNotNull(list);
	}

}
