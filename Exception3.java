import java.lang.*;
import java.util.*;
import java.lang.Exception;


class Exception3
{
	public static void main(String a[])
	{
		int Arr[] = {10,20,30,40,50};
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("enter the index");
		int index = sobj.nextInt();
		
		try
		{
			System.out.println("Inside try");
		    System.out.println("Elements at that index is:" +Arr[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Inside catch");
			System.out.println(obj);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		
	
	
	}
	
}

