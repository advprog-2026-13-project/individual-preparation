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



  @Test
  void norm_singleElement() {
    assertEquals(5.0, util.norm(new double[] {5.0}), 1e-9);
    assertEquals(5.0, util.norm(new double[] {-5.0}), 1e-9);
  }

  @Test
  void norm_multipleElements() {
    assertEquals(
        Math.sqrt(14.0),
        util.norm(new double[] {1.0, 2.0, 3.0}),
        1e-9);

    assertEquals(
            Math.sqrt(23.0),
            util.norm(new double[] {-2.0, 3.0, 3.0,-1.0}),
            1e-9);
  }

  @Test
  void norm_lengthZero_throws(){
    assertThrows(
            IllegalArgumentException.class,
            () -> util.norm(new double[] {}));
  }
}
