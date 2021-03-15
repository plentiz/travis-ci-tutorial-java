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

<<<<<<< HEAD
=======
	@Test
	public void testTest() {
		assertEquals(true, true);
	}

>>>>>>> 8a32cea4f739c04ffd6dcbdd4648b51541cd8753
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
<<<<<<< HEAD
    public void printNumbers_10() {
		PrintNumbers.printNumbersInRange(10);
		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", outputStreamCaptor.toString().trim());
	}

	@Test
    public void printNumbers_11() {
		PrintNumbers.printNumbersInRange(11);
		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11", outputStreamCaptor.toString().trim());
	}

	@Test
    public void printNumbers_1() {
		PrintNumbers.printNumbersInRange(1);
		assertEquals("1", outputStreamCaptor.toString().trim());
	}

	@Test
    public void printNumbers_0() {
		PrintNumbers.printNumbersInRange(0);
		assertEquals("", outputStreamCaptor.toString().trim());
	}

=======
    public void printLoop() {
		PrintNumbers.printLoop(10);
		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", outputStreamCaptor.toString().trim());
	}

>>>>>>> 8a32cea4f739c04ffd6dcbdd4648b51541cd8753
	@After
	public void tearDown() {
		System.setOut(standardOut);
	}
}
