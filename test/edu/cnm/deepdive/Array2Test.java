package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Test {
  Array2 array = new Array2();
  Array2 arrayTwo = new Array2();
  Array2 arrayThree = new Array2();
  Array2 arrayFour = new Array2();
  Array2 arrayFive = new Array2();
  Array2 arraySix = new Array2();
  Array2 arraySeven = new Array2();


  int [] test1 = new int[] {1, 2, 2};
  int [] test2 = new int[] {4,4,1};
  int [] test3 = new int[] {1,2,3,4,4};
  int [] test4 = new int[] {2,2,3,4};
  int [] test5 = new int[] {1,2,3,2,2,4};
  int [] test6 = new int[] {2,2};
  int [] test7 = new int[] {4,4};

  @Test
  void either24(int[] test1) {
    assertTrue(array.either24(test1));
  }
}
