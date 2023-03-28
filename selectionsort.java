import java.util.Arrays;
class SelectionSort
{
    public static void main(String arge[])
    {
        int arr[]={8,7,1,9,5,0,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    
    static int[] sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        
        return arr;
        
        
    }
}
