package io.github.joaomlneto.travis_ci_tutorial_java;

import io.github.joaomlneto.travis_ci_tutorial_java.obj.TriangleVertice;

public class TriangleTest {
    public static float area(TriangleVertice A, TriangleVertice B, TriangleVertice C) {
        float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        return Math.abs(area);
      }

      public static float area(int base, int height) {
        return (base * height) / 2.0f;
      }
    
}
