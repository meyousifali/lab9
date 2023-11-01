import java.util.Arrays;

public class Task_1 {

	public static void main(String[] args) {
		
		int array[]= {1,2,4,4,6,7,8,8,9,3,3};
		int j=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]%2==0) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
				j++;
			}
		}
		
		System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));

	}

}
