package advance.dev;

public class Triagle extends Shape {
	private double a;
	private double b;
	private double c;
	

	
	public Triagle (double a, double b, double c)	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = (a+b+c);
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
