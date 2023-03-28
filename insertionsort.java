import java.util.Arrays;
class insertionsort
{
    public static void main(String arge[])
    {
        int arr[]={8,7,1,9,5,0,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    
    static int[] sort(int[]arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
               if(arr[j]<arr[j-1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
               else
               {
                   break;
               }
            }
        }
        return arr;
    }
}
