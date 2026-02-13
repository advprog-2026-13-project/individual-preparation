package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

  public double add(double o1, double o2) {
    return o1 + o2;
  }

  public double subtract(double o1, double o2) {
    double result = o1 - o2;
    return result;
  }

  public double multiply(double o1, double o2) {
    // TODO: Implement me properly!
    return o1 * o2;
  }

  public double divide(double o1, double o2) {
    // TODO: Implement me properly!
    return 0.0;
  }

  // Assumes 0^0 == 1
  public double exponent(double o1, int n) {
    if (n == 0) {
      return 1.0;
    }

    if (o1 == 0.0 && n < 0) {
      throw new IllegalArgumentException("Zero cannot be raised to a negative power");
    }

    double result = 1.0;
    int absN = Math.abs(n);

    for (int i = 0; i < absN; i++) {
      result *= o1;
    }

    if (n < 0) {
      return 1.0 / result;
    }

    return result;
  }
}
