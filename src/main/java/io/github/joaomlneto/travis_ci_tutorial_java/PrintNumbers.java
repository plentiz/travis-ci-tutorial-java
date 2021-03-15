package io.github.joaomlneto.travis_ci_tutorial_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbers {

	public static void printNumbersInRange(int end) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= end; i++) {
			result.add(i);
		}
		System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(", ")));
	}

	public static final void main(String[] args) {
		System.out.println("Hello world?");
	}

}
