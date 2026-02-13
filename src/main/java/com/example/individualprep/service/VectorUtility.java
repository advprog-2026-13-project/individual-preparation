package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {

  public double[] add(double[] v1, double[] v2) {
    if (v1 == null || v2 == null) {
      throw new IllegalArgumentException("Vectors must not be null");
    }
    if (v1.length != v2.length) {
      throw new IllegalArgumentException("Vector length is not the same");
    }

    double[] result = new double[v1.length];

    for (int i = 0; i < v1.length; i++) {
      result[i] = v1[i] + v2[i];
    }

    return result;
  }

  public double[] subtract(double[] v1, double[] v2) {
    // TODO: Implement me properly!
    return new double[] {0.0, 0.0, 0.0};
  }

  public double[] multiply(double[] v1, int x) {
    // TODO: Implement me properly!
    if (v1 == null) {
      throw new IllegalArgumentException("Input array 'v1' cannot be null.");
    }

    double[] result = new double[v1.length];
    for (int i = 0; i < v1.length; i++) {
      result[i] = v1[i] * x;
    }

    return result;
  }

  public double dotProduct(double[] v1, double[] v2) {
    if (v1 == null || v2 == null) {
      throw new IllegalArgumentException("Vectors must not be null");
    }
    if (v1.length != v2.length) {
      throw new IllegalArgumentException("Vector length is not the same");
    }

    double result = 0.0;

    for (int i = 0; i < v1.length; i++) {
      result += v1[i] * v2[i];
    }

    return result;
  }

  public double norm(double[] v1) {
    if (v1 == null) {
      throw new IllegalArgumentException("Vectors must not be null");
    }
    if (v1.length == 0) {
      throw new IllegalArgumentException("Vector must have at least one element");
    }

    // Reduce floating point error as much as possible for 1D case
    if (v1.length == 1) {
      return Math.abs(v1[0]);
    }

    double innerDotProduct = 0;
    for (double v : v1) {
      innerDotProduct += v * v;
    }
    return Math.sqrt(innerDotProduct);
  }
}
