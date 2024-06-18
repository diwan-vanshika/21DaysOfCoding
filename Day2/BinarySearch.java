//For ascending order
public class BinarySearch {
    public static void main(String[] args) {
       int[] arr= { -12,-9,-6,-1,23,45,56,67,89} ;
       int target=-1;
       System.out.println(BiSearch(arr,target));
    }
    static int BiSearch(int[] arr,int target)
    {
        int len=arr.length;
        int start=0;
        int end =len-1;
        while(start<=end)
        {
           int mid = (start+end)/2;                    //int mid= start + (end-start)/2
                                                        //as for so big numbers it can cause errors
            if (arr[mid]<target)
            {
                start=mid+1;
            }
            else if (arr[mid]>target)
            {
                end=end-1;
            }
            else
            {
                return mid;
            }


        }
        return -1;
    }
}

/*Algorithm
find mid
if(target==mid)
return mid
if (target > mid)
start=mid+1;
if(target<mid)
end=mid-1;
if(start>end)
return "element no found"
 */