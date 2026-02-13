package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.*;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IndividualprepApplicationTests {

  private final VectorUtility vectorUtility = new VectorUtility();

  @Test
  void contextLoads() {}

  @Test
  void testDotProductSuccess() {
    double[] v1 = {1.0, 2.0, 3.0};
    double[] v2 = {4.0, 5.0, 6.0};

    double expected = 32.0;
    double actual = vectorUtility.dotProduct(v1, v2);

    assertEquals(expected, actual, 0.0001);
  }

  @Test
  void testDotProductNull() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          vectorUtility.dotProduct(null, new double[] {1.0});
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
              vectorUtility.dotProduct(v1, v2);
            });

    assertEquals("Vector length is not the same", exception.getMessage());
  }

  @Test
  void testDotProductZero() {
    double[] v1 = {0.0, 0.0};
    double[] v2 = {1.0, 2.0};
    assertEquals(0.0, vectorUtility.dotProduct(v1, v2));
  }
}
