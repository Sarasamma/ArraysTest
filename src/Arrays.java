
public class Arrays {

	public static void main(String[] args) {
// Reversing array elements ([70,35,15,40,10]) and printing smallest,largest,average and sum of the elements in the array		
int arr[]= {10,40,15,35,70};
int large=arr[0];
int small=arr[0];
int sum=0;
int avg=0;
System.out.println("Reversed array:");
for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
}
System.out.println();
for(int i=0;i<arr.length;i++) {
	
	if(arr[i]>large) {
		large=arr[i];
	}
		if(arr[i]<small) {
		small=arr[i];
	}
	
	sum=sum+arr[i];
	avg=sum/arr.length;
	
}
System.out.print("Large element :");
System.out.println(large);
System.out.print("Smallest Element:");
System.out.println(small);
System.out.print("Sum of the elements in the array :");
System.out.println(sum);
System.out.print("Average of the elements in the array:");
System.out.println(avg);
	}
}
