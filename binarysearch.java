class main{
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(Binarysearch(arr,target));
    }
    
    static int Binarysearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<mid)
            {
                end=mid-1;
            }
            else if(target>mid)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
