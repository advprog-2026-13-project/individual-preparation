package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {
  private final VectorUtility util = new VectorUtility();

  @Test
  void add_sameLength() {
    assertArrayEquals(
        new double[] {5.0, 7.0, 9.0},
        util.add(new double[] {1.0, 2.0, 3.0}, new double[] {4.0, 5.0, 6.0}),
        1e-9);
  }

  @Test
  void add_lengthMismatch_throws() {
    assertThrows(
        IllegalArgumentException.class,
        () -> util.add(new double[] {1.0}, new double[] {1.0, 2.0}));
  }
}
