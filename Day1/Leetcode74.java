//https://leetcode.com/problems/search-a-2d-matrix/description/
//Search a 2-D Matrix
public class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int target = 3;
        boolean a = searchMatrix(matrix,target);
        System.out.println(a);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols= matrix[0].length;
        int row=0;
        int col=cols-1;

        while(row < rows && col >=0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            if(matrix[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return false;
    }
}
