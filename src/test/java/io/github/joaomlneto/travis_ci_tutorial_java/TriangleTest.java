package io.github.joaomlneto.travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.joaomlneto.travis_ci_tutorial_java.obj.TriangleVertex;

public class TriangleTest {

	@Test
	public void countArea_16() {
		assertEquals("Area should be 16", 16, Triangle.area(getVertex(2, 2), getVertex(3, 9), getVertex(7, 5)), 0.0001);
	}

	@Test
	public void countArea_7() {
		assertEquals("Area should be 7", 7, Triangle.area(getVertex(1, 0), getVertex(2, 6), getVertex(5, 10)), 0.0001);
	}

	private static TriangleVertex getVertex(int x, int y) {
		return new TriangleVertex(x, y);
	}
}
