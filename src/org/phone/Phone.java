package org.phone;

public class Phone {
	
	private void phoneInfo() {
		System.out.println("Phone Details");
	}
	
	private void phoneInfo(String make) {
		System.out.println("Phone model: "+make);
	}
	
	private void phoneInfo(int size) {
		System.out.println("Ram Size: "+size);
	}
	
	private void phoneInfo(int camera, int storage) {
		System.out.println("Phone Camera"+camera+"MP");
		System.out.println("Storage: "+storage);
	}
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.phoneInfo();
		p.phoneInfo("Samsung");
		p.phoneInfo(8);
		p.phoneInfo(24, 64);
	}

}