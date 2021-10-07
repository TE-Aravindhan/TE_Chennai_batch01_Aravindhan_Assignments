import java.util.*;
public class Nd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int count =s.nextInt();
		int arr [] = new int[count];
		System.out.println("Enter the array elements");
		for(int i=0;i<count;i++){
			arr[i]= s.nextInt();
		}
		s.close();
		Arrays.sort(arr);
		for(int i=0;i<count;i++) {
			if(i>0) {
				if(arr[i-1]==arr[i])
					continue;
			}
			System.out.print(arr[i]+ "  ");
		}
	}
}
