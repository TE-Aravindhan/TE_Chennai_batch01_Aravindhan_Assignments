import java.util.*;
public class keyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int count =s.nextInt();
		System.out.println("Enter the key value");
		int key =s.nextInt();
		int arr [] = new int[count];
		System.out.println("Enter the array elements");
		for(int i=0;i<count;i++){
			arr[i]= s.nextInt();
		}
		s.close();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arr[i]+arr[j]==key) {
					int a []= new int[2];
					a[0]=arr[i];
					a[1]=arr[j];
					System.out.println(Arrays.toString(a));			
				}
			}
		}
			
	}

}
