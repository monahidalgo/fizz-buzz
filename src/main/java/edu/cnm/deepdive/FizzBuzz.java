package edu.cnm.deepdive;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  public String check(int value) {
    String result;
    boolean divisibleBy3 = value % 3 == 0;
    boolean divisibleBy5 = value % 5 == 0;
    if (divisibleBy3 && divisibleBy5) {
      result = FIZZ_BUZZ;
    } else if (divisibleBy3) {
      result = FIZZ;
    } else if (divisibleBy5){
      result = BUZZ;
    } else {
      result = String.valueOf(value);
    }
    return result;
  }

}