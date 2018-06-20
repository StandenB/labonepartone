import java.util.Scanner;
public class Labone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number1;
		 int number2;
		 //boolean theSame;
		 //int i;
		 int sum1 = 0;
		 int sum2 = 0;
		 int sum3 = 0;
		 int num11 = 0;
		 int num12 = 0;
		 int num13 = 0;
		 int num21 = 0;
		 int num22 = 0;
		 int num23 = 0;
		 
		 Scanner scnr = new Scanner(System.in);
		 
		 System.out.println("Enter 3-digit number: ");
		 number1 = scnr.nextInt();
		 
		 System.out.println("Enter 3-digit number: ");
		 number2 = scnr.nextInt();
		 
			 num13 = number1/100;
			 num12 = (number1-(num13*100))/10;
			 num11 = (number1-(num13*100 + num12*10));
			 num23 = number2/100;
			 num22 = (number2-(num23*100))/10;
			 num21 = (number2-(num23*100 + num22*10));
			 
			 sum1 = num11 + num21;
			 sum2 = num12 + num22;
			 sum3 = num13 + num23;
			 
			 if (sum1 == sum2 && sum2 == sum3) {
				 System.out.println("True");
			 }
			 else {
					 System.out.println("False");
			 }
	}

}
