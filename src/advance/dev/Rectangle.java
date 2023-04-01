package advance.dev;

public class Rectangle extends Shape {
	
	private double chieuDai;
	private double chieuRong;

	public Rectangle(double chieuDai,double chieuRong)	{
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return ( chieuDai +chieuRong)*2;
	}

}
