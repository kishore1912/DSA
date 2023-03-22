public class Main
{
	public static void main(String[] args) {
		//String name="kishore";
		//char target='h';
		//System.out.println(search2(name,target));
		
		int arr[]={34,56,23,45,12,21,34,67,7};
		int target=12;
		System.out.println(search3(arr,target,4,6));
	    System.out.println("minimum number is "+min(arr));
	    System.out.println("maximum number is "+max(arr));
	}
	
	//linear search for integers
	
	static int search(int arr[],int target)
	{
	    if(arr.length==0)
	    {
	        return -1;
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        int element=arr[i];
	        if(element==target)
	        {
	            return i;
	        }
	    }
	    return -1;
	}
	
	//linear search for string
		static boolean search2(String str,char target)
	{
	    if(str.length()==0)
	    {
	        return false;
	    }
	    
	    for(char ch :str.toCharArray())
	    {
	        if(ch==target)
	        return true;
	    }
	    return false;
	}
	
	//for range
	static boolean search3(int arr[],int target,int start,int end)
	{
	    if(arr.length==0)
	    {
	        return false;
	    }
	    
	    for(int i=start;i<=end;i++)
	    {
	        int element=arr[i];
	        if(element==target)
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	//for minimum
	
	static int min(int arr[])
	{
	    int ini=arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	       if(arr[i]<ini){
	        ini=arr[i];
	    }
	    }
	    return ini;
	}
	
	//for maximum
	static int max(int arr[])
	{
	    int ini=arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	       if(arr[i]>ini){
	        ini=arr[i];
	    }
	    }
	    return ini;
	}
	
	
}
