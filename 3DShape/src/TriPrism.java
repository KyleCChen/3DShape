
public class TriPrism extends Prism{
	private double base;
	private double hyp;
	private double a;
	public TriPrism(double base, double height, double length) {
		super(height, length);
		this.a = base/2;
		this.base = base;
		this.hyp = Math.sqrt((a * a) + (height * height));
	}
	public double getSA() {
		return (base * height) + (2 * (hyp * length)) + (base * length);
	}
	public double getVolume() {
		return ((base * height)/2) * length;
	}
}
