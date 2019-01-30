
public class RectPrism extends Prism{
	private double width;
	
	public RectPrism(double height, double length, double width) {
		super(height, length);
		this.width = width;
	}
	public double getSA() {
		return 2*((width * length) + (height * length) + (height * width));
	}
	public double getVolume() {
		return length * width * height;
	}
}
