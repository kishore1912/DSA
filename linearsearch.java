public class Main
{
	public static void main(String[] args) {
		String name="kishore";
		char target='h';
		System.out.println(search2(name,target));
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
	
	
}
