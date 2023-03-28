import java.util.Arrays;
class binary2Dmatrix{
    public static void main(String arge[])
    {
        int arr[][]={
            {10,20,30,40},
            {2,35,45,55},
            {34,43,52,67}
        };
       
        System.out.println(Arrays.toString(search(arr,55)));
    }
    
    static int[] search(int matrix[][] , int target)
    {
        int r=0;
        int c=matrix.length -1;
        while( r< matrix.length && c >= 0)
        {
            if(matrix[r][c]==target)
            {
                return new int []{r,c};
            }
            if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
