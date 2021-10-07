import java.util.*;
public class P2 {
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
		System.out.println("Ascending order");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("Descending order");
		for(int i=count-1;i>=0;i--) {
			System.out.print(arr[i]+"  ");
		}
	}

}
