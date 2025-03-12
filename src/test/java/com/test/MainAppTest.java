package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	@Test
	public void testSum() {
		MainApp s=new MainApp();
		assertEquals(5, s.addition(2, 3));
	}
	@Test
	public void testSum1() {
		MainApp s=new MainApp();
		assertEquals(-1, s.addition(2, -3));
	}
}
