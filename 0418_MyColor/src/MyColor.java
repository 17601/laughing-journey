import java.awt.Color;

public class MyColor extends Color implements Comparable<MyColor> {
	
	private static final long serialVersionUID = 1L;
	int red, green,blue;
	public MyColor(int red, int green, int blue) {
		super(red, green, blue);
	}

	@Override
	public int compareTo(MyColor color) {
		return Integer.compare(getRed()+getBlue()+getGreen(),
				color.getRed()+color.getGreen()+color.getBlue());
	}
	@Override
	public String toString() {
		return "("+getRed()+","+getGreen()+","+getBlue()+")";
	}
	

}
