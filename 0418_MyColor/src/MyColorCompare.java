import java.util.Comparator;

public class MyColorCompare implements Comparator<MyColor>{
	ColComponent comp;
	
	MyColorCompare(ColComponent comp){
		this.comp=comp;
	}
	@Override
	public int compare(MyColor color0, MyColor color1) {
		switch (comp) {
		case RED:
			return Integer.compare(color0.getRed(), color1.getRed());
		case GREEN:
			return Integer.compare(color0.getGreen(), color1.getGreen());
		case BLUE:
			return Integer.compare(color0.getBlue(), color1.getBlue());
		default:
			return 0;
		}
		
	}
	boolean	equals(MyColor color) {
		return true;
	}
	/*public enum ColComponent{
		RED, GREEN, BLUE
	}*/
}
