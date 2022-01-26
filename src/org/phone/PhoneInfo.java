package org.phone;

public class PhoneInfo {

	private void phoneName() {
System.out.println("one plus");
	}
	private void phoneMieiNum() {
System.out.println("829364832962292");
	}
	private void camera() {
System.out.println("front=16mp,rear=32mp");
	}
	private void storage() {
System.out.println("internal memory=256GB");
	}
	private void osName() {
System.out.println("snapdragon 732G processor");
	}
	public static void main(String[] args) {
	PhoneInfo mobile = new PhoneInfo();
mobile.phoneName();
mobile.phoneMieiNum();
mobile.camera();
mobile.storage();
mobile.osName();
	}
	
	

}
