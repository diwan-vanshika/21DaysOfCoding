import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//AllMissingNumbers
public class Leetcode448 {
    public static void main(String[] args) {
        int[] arr= {3,1,4,5,1,4};
        System.out.println(MissingNumber(arr));
    }
    static List<Integer> MissingNumber(int[] arr) {
        int index=0;
        while(index  < arr.length)
        {
            //index=value-1
            int value = arr[index]-1;
            if(arr[index]  !=  arr[value])
            {
                swap(arr,index,value);
            }
            else {
                index++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != i+1)
            {
                ans.add(i+1);
            }
        }
        return ans;

    }
    static void swap (int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
