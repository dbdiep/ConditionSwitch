package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen");
		int i = sc.nextInt();
		
		switch (i) {
			case 0:
				System.out.println( "0 la so khong duong va khong am");
		}
		
		System.out.println("Nhap so n");
		int n = sc.nextInt();
		
		switch (n) {
				
		}
		
		System.out.println("Nhap so thang trong nam");
		int m = sc.nextInt();
		
		switch (m) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("Thang co 31 ngay");
				break;
			case 4, 6, 9, 11: 
				System.out.println("Thang co 30 ngay");
				break;
			case 2:
				System.out.println("Thang co 28 ngay hoac 29 ngay");
				break;
		}
		
		System.out.println("Nhap vao he so a ");
		int a = sc.nextFloat();
		sc.nextLine();

		System.out.println("Nhap vao he so b ");
		int b =  sc.nextFloat();
		sc.nextLine();

		System.out.println("Nhap vao he so c ");
		int c =  sc.nextFloat();
		sc.nextLine();
		
		switch (a) {
			case 0: {
				switch (b) {
					case 0:
						switch (c) {
							case 0:
								System.out.println("Phuong trinh co vo so nghiem");
								break;
							default:
								System.out.println("Phuong trinh vo nghiem");
								break;
						}
					default:	
						float x = (float)- c / b;
						System.out.format("Phuong trinh co nghiem x = %.2f %n", x);
				}
			}
			default:
				float delta = b * b - 4 * a * c;
				if (delta < 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else {
					float x1 = (float)(-b + Math.sqrt(delta) ) / (2 * a);
					float x2 = (float)(b + Math.sqrt(delta) ) / (2 * a);
					System.out.format("Phuong trinh co nghiem x1 = %.2f va x2 = %.2f %n", x1, x2);
				}
		}


		if (a == 0 || b == 0 || c == 0 || a < 0 || b < 0 || c < 0) {
			System.out.println("Khong phai 3 canh cua mot tam giac");
		} else {
			float d = a*c - (b*c);
			float e = a*b;
			float f = a*c + b*c;
			if (d < e) {
				if (e < f) {
					System.out.format("%d, %d, %d la 3 canh cua mot tam giac", a, b,c);
				} else {
					System.out.println("Khong phai 3 canh cua mot tam giac");
				}
			} else {
				System.out.println("Khong phai 3 canh cua mot tam giac");
			}
		}

	}
}
