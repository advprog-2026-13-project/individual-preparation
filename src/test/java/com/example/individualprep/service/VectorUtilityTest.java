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
  void testDotProductSuccess() {
    double[] v1 = {1.0, 2.0, 3.0};
    double[] v2 = {4.0, 5.0, 6.0};

    double expected = 32.0;
    double actual = util.dotProduct(v1, v2);

    assertEquals(expected, actual, 0.0001);
  }

  @Test
  void testDotProductNull() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          util.dotProduct(null, new double[] {1.0});
        },
        "Vector must not be null");
  }

  @Test
  void testDotProductLengthMismatch() {
    double[] v1 = {1.0, 2.0};
    double[] v2 = {1.0, 2.0, 3.0};

    Exception exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              util.dotProduct(v1, v2);
            });

    assertEquals("Vector length is not the same", exception.getMessage());
  }

  @Test
  void testDotProductZero() {
    double[] v1 = {0.0, 0.0};
    double[] v2 = {1.0, 2.0};
    assertEquals(0.0, util.dotProduct(v1, v2));
  }
}
