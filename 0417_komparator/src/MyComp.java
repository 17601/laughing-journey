import java.util.Comparator;

public class MyComp implements Comparator<Integer>{
	COMP comp;
	MyComp(COMP comp){
		this.comp=comp;
	}
	public int compare(Integer a, Integer b) {
		switch(comp) {
		case ByVal:		return a.compareTo(b);
		case ByValRev:	return -a.compareTo(b);
		case ByNumOfDivs:
			if (numOfDivs(a)==numOfDivs(b)) return a.compareTo(b);
			else return numOfDivs(a).compareTo(numOfDivs(b));
		case BySumOfDigs:
			if (sumOfDigs(a)==sumOfDigs(b)) return a.compareTo(b);
			else return sumOfDigs(a).compareTo(sumOfDigs(b));
		default: return 0;
		}
	}
	static Integer numOfDivs(int a) {
		if (a == 0) return 0;
		int counter = 0;
		for (int i =1; i<=Math.abs(a); i++) {
			if (a%i==0) counter++;
		}
		return counter;
	}
	static Integer sumOfDigs(int a) {
		int suma=0;
		String s = Integer.toString(a);
		for (int i=0;i<s.length();i++) {
			suma+=Character.getNumericValue(s.charAt(i));
		}
		return suma;
	}
	enum COMP{
		ByVal, ByNumOfDivs, ByValRev, BySumOfDigs
	}
}