package giaiphuongtrinh;

import java.util.Scanner;

public class giaiphuongtrinh {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			float a = input.nextFloat();
			System.out.print("Nhap b: ");
			float b = input.nextFloat();
			float nghiem;
			if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh nay co vo so nghiem.");
	            } else {
	                System.out.println("Phuong trinh vo nghiem.");
	            }
	        } else {
	            nghiem = -b / a;   
	            System.out.println("Phuong trinh co nghiem x = " + nghiem);
	        }
		}catch(Exception e) { 
		System.out.println("Nhap sai du lieu");
	}}
}
