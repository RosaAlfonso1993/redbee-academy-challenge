package com.redbee.academy.challenge;

import java.util.List;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    if(array.isEmpty() || array == null){
      return 0;
    }else{
      return array.stream().reduce(0, (total,number) -> total + number);
    }
  }
}
