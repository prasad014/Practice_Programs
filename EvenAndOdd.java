//Even and odd number java
import java.util.Scanner;
class EvenAndOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number=sc.nextInt();
		System.out.println((number%2==0)?number+"Number is Even":number +"Number is Odd");

	}
}