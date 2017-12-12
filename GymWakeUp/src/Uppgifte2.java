import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormat;

public class Uppgifte2 {
	private static int m;
	private static Scanner sc;
	private static int monthlyPrice;
    private static int MEMBERSHIP = 100;
    private static int totalPriceMonthly; 

	public static void main(String[] args) {
		System.out.println("How long do you want to be a member?");
		setMonth(m);
		getMonthlyPrice();
		getTotalPrice();
	}
	
	public static void setMonth(int month){
		sc = new Scanner(System.in);
		month = sc.nextInt();
		m = month; 
	}
	
	public static int getMonth(){
		return m;
	}
	
	public static void setMonthlyPrice(int myMonthlyPrice){
		monthlyPrice = myMonthlyPrice;
	}
	
	public static int getMonthlyPrice(){
		if ( 1<=getMonth() && getMonth()<=2 ){
			setMonthlyPrice(400);
		} else if (getMonth() <= 6) {
			setMonthlyPrice(350);
		} else if (getMonth() > 12) {
			setMonthlyPrice(250);
		} else {
			setMonthlyPrice(300);
		}
		return monthlyPrice;
	}
	
	public static int getTotalPrice(){
		totalPriceMonthly = monthlyPrice + MEMBERSHIP;
		System.out.println("Price for membership is: " + MEMBERSHIP);
		System.out.println("Monthly price for " + m + " months is: " + getMonthlyPrice());
		System.out.println("Total monthly price for " + m + " months's Gym card is: " + totalPriceMonthly);
		return totalPriceMonthly;
	}
	
	

}
