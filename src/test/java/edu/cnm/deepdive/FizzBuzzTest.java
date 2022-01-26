package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void check() {
    FizzBuzz fb = new FizzBuzz();
    assertEquals(FizzBuzz.FIZZ, fb.check(9));
    assertEquals(FizzBuzz.BUZZ, fb.check(20));
    assertEquals(FizzBuzz.FIZZ_BUZZ, fb.check(15));
    assertEquals(String.valueOf(1), fb.check(1));
  }
}