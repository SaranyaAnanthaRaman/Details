package org.phone;
public class Phone {
	private void phoneInfo(String model) {
		System.out.println("Model name is "+model);
		this.phoneInfo(123465347659879l);
		this.phoneInfo(16, 48);
		this.phoneInfo(64);
		this.phoneInfo("Qualcomm Snapdragon", "Blue");
	}
	private void phoneInfo(long imeino) {
		System.out.println("imei no is "+imeino);
	}
	private void phoneInfo(int Camfront, int Camrear) {
		System.out.println("Front cam is "+Camfront +"\n" +"Rear cam is "+Camrear);
	}
	private void phoneInfo(int storage) {
		System.out.println("Storage is "+storage);
	}
	private void phoneInfo(String OS, String color) {
		System.out.println("OS used "+OS +"\n" +"Color is "+color);
	}
public static void main(String[]args) {
	Phone a = new Phone();
	a.phoneInfo("Realme 5 pro");
	System.out.println("Work done by Dev team");
}
}
