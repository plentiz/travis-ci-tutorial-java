package io.github.joaomlneto.travis_ci_tutorial_java;

import io.github.joaomlneto.travis_ci_tutorial_java.obj.TriangleVertice;

public class Triangle {
    public static float area(TriangleVertice V1, TriangleVertice V2, TriangleVertice V3) {
        float area = (V1.x * (V2.y - V3.y) + V2.x * (V3.y - V1.y) + V3.x * (V1.y - V2.y)) / 2.0f;
        return Math.abs(area);
      }
    
}
