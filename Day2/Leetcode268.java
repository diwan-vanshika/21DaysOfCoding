import java.util.Arrays;

//Missing Number
//https://leetcode.com/problems/missing-number/
public class Leetcode268 {
    public static void main(String[] args) {
        int[] arr= {3,0,1,4};
        System.out.println(MissingNumber(arr));
    }
    static int MissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] != index)
            {
                return index;
            }
        }
        return nums.length;

    }
    static void swap (int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
