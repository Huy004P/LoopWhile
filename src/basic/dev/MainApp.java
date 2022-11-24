package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11.1.Viết chương trình tính tổng các sốtừ1 đến 100
		int i = 0;
		int tong = 0;
		while (i <= 100) {
			tong += i;
			i++;
		}
		System.out.println("Tong= " + tong);
		// 11.2.Viết chương tình nhập vào một sốtựnhiên n. Tính tổng các
		// sốchia hết cho 3 béhơn n.
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		int a = 1;
		int tong1 = 0;
		while (a <= n) {
			if (a % 3 == 0) {
				tong1 += a;
			}
			
			a++;
		}
System.out.println(tong1);
	}
}