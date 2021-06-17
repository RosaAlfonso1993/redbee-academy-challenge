package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */

  public static Integer isNull(Integer num) {
    return Objects.requireNonNullElse(num,0);
  }
  public static Integer max(Integer a, Integer b, Integer c) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(isNull(a));
    list.add(isNull(b));
    list.add(isNull(c));
    return list.stream().max(Integer::compare).get();
  }
}
