package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Array2Test {

  Array2 array = new Array2();
  Array2 arrayTwo = new Array2();
  Array2 arrayThree = new Array2();
  Array2 arrayFour = new Array2();
  Array2 arrayFive = new Array2();
  Array2 arraySix = new Array2();
  Array2 arraySeven = new Array2();


  static Object[][] input = {
      {new int[]{1, 2, 2}, true},
      {new int[]{4, 4, 1}, true},
      {new int[]{1, 2, 3, 4, 4}, true},
      {new int[]{2, 2, 3, 4}, true},
      {new int[]{1, 2, 3, 2, 2, 4}, true},
      {new int[]{2, 2}, true},
      {new int[]{4, 4}, true},
      {new int[] {4,4,1,2,2}, false},
      {new int[] {1,2,3,4}, false},
      {new int[] {3,5,9}, false},
      {new int[] {1,2,3,2,2,4,4}, false},
      {new int[] {1,2}, false},
      {new int[] {2}, false},
      {new int[] {}, false}
  };

  private static Object[][] either24Source() {
    return input;
  }


  @ParameterizedTest
  @MethodSource("either24Source")
  void either24(int[] nums, boolean expected) {
    boolean actual = array.either24(nums);
    if (expected) {
      assertTrue(actual);
    } else {
      assertFalse(actual);
    }
  }
}