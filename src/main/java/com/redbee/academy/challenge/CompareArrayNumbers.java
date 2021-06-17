package com.redbee.academy.challenge;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer isNull(Integer num) {
    return Objects.requireNonNullElse(num,0);
  }

  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> listAllNumbers = new ArrayList<Integer>();
    
    a.forEach(number -> listAllNumbers.add(number));
    b.forEach(number -> listAllNumbers.add(number));

    
    Collections.sort(listAllNumbers);
    Collections.reverse(listAllNumbers);
    listAllNumbers.stream().limit(3);
    return listAllNumbers;
  }



}
