package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		maxDienTich(shapes);
		maxCircle(shapes);
		maxRetangle(shapes);
		maxTriangle(shapes);
	}

	public static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			if(i<3) {
				System.out.println("Nhap ban kinh hinh TRON thu " +(i+1)+ " : ");
				double banKinh = sc.nextDouble();
				shapes[i] = new Circle(banKinh);
				}else if(i<6){
				System.out.println("Nhap canh hinh CHU NHAT " +(i+1)+ " : ");
				System.out.println("nhap chieu dai : ");
				double chieDai = sc.nextDouble();
				System.out.println("nhap chieu rong : ");
				double ChieuRong = sc.nextDouble();
				shapes[i] = new Rectangle(chieDai, ChieuRong);
				}else {
				System.out.println("Nhap canh hinh TAM GIAC a, b, c thu " +(i+1)+ " : ");
				System.out.println("nha canh a :");
				double a = sc.nextDouble();
				System.out.println("nha canh b : ");
				double b = sc.nextDouble();
				System.out.println("nha canh c : ");
				double c = sc.nextDouble();
				shapes[i] = new Triagle(a, b, c);

			}
		}

	}

	public static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}

	public static void maxDienTich(Shape[] shapes) {
		int n = 0;
		Shape answer = shapes[0];
		double max = shapes[0].dienTich();
		for (int i = 1; i < shapes.length; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
	}

	public static void maxCircle(Shape[] shapes) {
		int n = 0;
		Shape answer = shapes[0];
		double max = shapes[0].dienTich();
		for (int i = 0; i < 3; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh tron co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);

	}

	public static void maxRetangle(Shape[] shapes) {
		int n = 3;
		Shape answer = shapes[3];
		double max = shapes[3].dienTich();
		for (int i = 3; i < 6; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh chu nhat co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
	}

	public static void maxTriangle(Shape[] shapes) {
		int n = 6;
		Shape answer = shapes[6];
		double max = shapes[6].dienTich();
		for (int i = 6; i < shapes.length; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh tam giac co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
}
}