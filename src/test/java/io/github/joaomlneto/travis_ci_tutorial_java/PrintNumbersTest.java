package io.github.joaomlneto.travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintNumbersTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Test
	public void testTest() {
		assertEquals(true, true);
	}

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
    public void printLoop() {
		PrintNumbers.printLoop(10);
		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", outputStreamCaptor.toString().trim());
	}

	@After
	public void tearDown() {
		System.setOut(standardOut);
	}
}
