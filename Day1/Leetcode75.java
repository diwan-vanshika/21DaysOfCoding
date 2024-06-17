import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
//SortColors
public class Leetcode75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void sortColors(int[] nums) {
        boolean swapped=false;
        int len=nums.length;
        for(int i=0; i<len;i++)
        {
            for(int j=1;j<len-i;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
