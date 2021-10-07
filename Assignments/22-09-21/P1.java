import java.util.*;
public class P1 {
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
		 //s.close();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
			if(arr[i]>arr[j]) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				}	
			}
		}
		System.out.println("Ascending order");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
			if(arr[i]<arr[j]) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				}	
			}
		}
		System.out.println("Descending order");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+"  ");
		}			
		
	}

}