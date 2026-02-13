package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {
  private final ArithmeticUtility util = new ArithmeticUtility();

  @Test
  void exponent_positive() {
    assertEquals(8.0, util.exponent(2.0, 3), 1e-9);
  }

  @Test
  void exponent_zero() {
    assertEquals(1.0, util.exponent(2.0, 0), 1e-9);
  }

  @Test
  void exponent_negative() {
    assertEquals(0.25, util.exponent(2.0, -2), 1e-9);
  }

  @Test
  void exponent_zeroBase_negativeExponent_throws() {
    assertThrows(IllegalArgumentException.class, () -> util.exponent(0.0, -1));
  }

  @Test
  void subtract_positive() {
    assertEquals(5.0, util.subtract(10.0, 5.0), 1e-9);
  }

  @Test
  void subtract_withNegative() {
    // 10.0 - (-5.0) = 15.0
    assertEquals(15.0, util.subtract(10.0, -5.0), 1e-9);
  }

  @Test
  void subtract_resultZero() {
    assertEquals(0.0, util.subtract(7.5, 7.5), 1e-9);
  }

  @Test
  void add_positive(){

  }

  @Test
  void add_withNegative(){

  }

  @Test
  void add_resultZero(){

  }
}
