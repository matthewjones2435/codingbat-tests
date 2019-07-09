package edu.cnm.deepdive;

public class Array2 {

  public boolean either24(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++)
      if (nums[i] == 2 & nums[i + 1] == 2 || nums[i] == 4 & nums[i + 1] == 4) {
        return true;
      }
    return false;
  }


}

