import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Companies:");
		int a=sc.nextInt();
		System.out.println("Enter no.of Employees:");
		int b=sc.nextInt();
		String [][]arr=new String[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {	
		System.out.println("Enter employee no "+j+":"+"Enter employee no "+i+":");
		arr[i][j]=sc.next();
		}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {	
		System.out.println("Enter employee no "+j+":"+"Enter employee no "+i+":"+"is:"+arr[i][j]);
	}
		}
	}

}

//Output

//Enter no.of Companies:
//1
//Enter no.of Employees:
//2
//Enter employee no 0:Enter employee no 0:
//Alexa
//Enter employee no 1:Enter employee no 0:
//Don
//Enter employee no 0:Enter employee no 0:is:Alexa
//Enter employee no 1:Enter employee no 0:is:Don

