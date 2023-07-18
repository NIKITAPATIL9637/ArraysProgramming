import java.util.*;
public class duplicates {

	public static void main(String[] args) {
	int[] arr = new int[5];
	    
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre the Numbers: ");
		
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Duplictes numbers are following: ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j] + " ");
				}
			}
		}
	}

}
