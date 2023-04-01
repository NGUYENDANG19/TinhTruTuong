package advance.dev;

public class Circle extends Shape {
	
	private double banKinh;
	public Circle (double banKinh) {
		this.banKinh= banKinh;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return  2 * Math.PI * banKinh;
	}
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}
	

}
