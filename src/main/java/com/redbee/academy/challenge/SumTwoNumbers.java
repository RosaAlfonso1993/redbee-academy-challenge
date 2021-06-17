package com.redbee.academy.challenge;
import java.util.Objects;
public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer isNull(Integer num) {
    return Objects.requireNonNullElse(num,0);
  }

  public static Integer sum(Integer a, Integer b) {
    return isNull(a) + isNull(b);
  }
}
