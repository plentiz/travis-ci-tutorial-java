package io.github.joaomlneto.travis_ci_tutorial_java;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
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

=======
public class PrintNumbers {
    public static void printLoop(int loops) {
		for(int i=1; i < loops; i++) {
			System.out.println(i);	
		}
	}
>>>>>>> 8a32cea4f739c04ffd6dcbdd4648b51541cd8753
}
