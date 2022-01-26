package edu.cnm.deepdive;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";
  private static final int DEFAULT_LIMIT = 100;

  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    FizzBuzz fb = new FizzBuzz();
    for (int i = 1; i <=limit ; i++) {
      System.out.println(fb.check(i));
    }
  }

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