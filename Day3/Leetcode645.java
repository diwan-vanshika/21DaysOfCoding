import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
//SetMismatch
public class Leetcode645 {
    public static void main(String[] args) {
        int[] nums= {3,1,1,4};
        findErrorNums(nums);
        System.out.println(Arrays.toString(nums));
    }
   static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct= nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] != index+1)
            {
                return new int[]{nums[index], index+1};
            }
        }
        return new int[] {-1,-1};

    }
    static void swap (int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}