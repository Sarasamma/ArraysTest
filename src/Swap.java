
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int arr[]= {1,2,3,4,5,6,7};
				int swap=3;
				int temp=0;
				int start1=0;
				int end1=swap-1;
				int start2=swap;
				int end2=arr.length-1;
				
				while(start1<end1) {
					temp=arr[start1];
					arr[start1]=arr[end1];
					arr[end1]=temp;
					start1++;
					end1--;
				}
				while(start2<end2) {
					temp=arr[start2];
					arr[start2]=arr[end2];
					arr[end2]=temp;
					start2++;
					end2--;
				}
				start1=0;
				end2=arr.length-1;
				while(start1<end2) {
						temp=arr[start1];
						arr[start1]=arr[end2];
						arr[end2]=temp;
						start1++;
						end2--;

				}
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]);
					}
			
		


	}

}
