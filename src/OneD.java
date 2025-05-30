import java.util.Scanner;
public class OneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String []arr=new String[5];
for(int i=0;i<arr.length;i++) {
System.out.println("Enter employee no "+i+":");
arr[i]=sc.next();
}
for(String word:arr) {
	System.out.print(word+" ");
}

	}

}
//Outpt
//Enter employee no 0:
//John
//Enter employee no 1:
//Doe
//Enter employee no 2:
//James
//Enter employee no 3:
//Gosling
//Enter employee no 4:
//Python
//John Doe James Gosling Python 
