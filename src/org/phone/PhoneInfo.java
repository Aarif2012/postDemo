package org.phone;

public class PhoneInfo {
private void phoneName() {
	System.out.println("Phone Name:98989898989");
}
private void phoneMieiNum() {
	System.out.println("Phone MieiNum:hch2232292322232");
}
private void Camera() {
	System.out.println("Camera:64MP");
	
}
private void storage() {
	System.out.println("Storage:4gb");
	
}
private void osName() {
	System.out.println("OS Name:Android");
}
public static void main(String[] args) {
	PhoneInfo P=new PhoneInfo();
	P.phoneName();
	P.phoneMieiNum();
	P.Camera();
	P.storage();
	P.osName();
}
}
