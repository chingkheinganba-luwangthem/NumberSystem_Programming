import java.util.Scanner;

public class SpyNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Spy number or not");
		int num = sc.nextInt();
		System.out.println(num +(isSpy(num)? " is Spy Number": " is not Spy Number"));
		
	}
	
	public static boolean isSpy(int num) {
		int temp1=0;
		int temp2 =1;
		while(num >0) {
			temp1 += num%10;
			temp2*= num%10;
			num/=10;
			
		}
		return temp1 == temp2;
	
	}

}
