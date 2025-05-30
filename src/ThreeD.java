import java.util.Scanner;
public class ThreeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Organizations:");
		int m=sc.nextInt();
		System.out.println("Enter no.of Companies:");
		int n=sc.nextInt();
		System.out.println("Enter no.of Employees:");
		int o=sc.nextInt();
		String [][][]arr=new String[m][n][o];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<o;k++) {
		System.out.println("Enter employee no from "+k+":"+"Comapany "+j+"of Oranization "+i+":");
		arr[i][j][k]=sc.next();
		}
		}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {	
				for(int k=0;k<o;k++) {
					System.out.println("Enter employee no from "+k+":"+"Comapany "+j+"of Oranization "+i+":"+arr[i][j][k]);

	}
		}

	}
	}
}

//Output

//Enter no.of Organizations:
//1
//Enter no.of Companies:
//1
//Enter no.of Employees:
//2
//Enter employee no from 0:Comapany 0of Oranization 0:
//Java
//Enter employee no from 1:Comapany 0of Oranization 0:
//Python
//Enter employee no from 0:Comapany 0of Oranization 0:Java
//Enter employee no from 1:Comapany 0of Oranization 0:Python

