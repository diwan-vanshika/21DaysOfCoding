//Linear Search 
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums= { 23,55,67,34,12,57 };
        int target= 12;
        int ans= ls(nums,target,3,5);
        System.out.println(ans);
    }

    public static int ls(int[] arr, int target,int start,int end) {
        if (arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            int element = arr[index];
            if(element==target)
            {
                return index;
            }
        }
return -1;
    }
}
