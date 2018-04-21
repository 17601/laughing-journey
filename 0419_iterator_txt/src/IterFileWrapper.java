import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class IterFileWrapper implements Iterable<String> {
	BufferedReader plik;
	IterFileWrapper(String path) throws IOException{
		plik = new BufferedReader(new FileReader(path));
	}
	@Override
	public Iterator<String> iterator() {
		return new LineIterator();
	}
	public class LineIterator implements Iterator<String>{
		String s;
		@Override
		public boolean hasNext() {
			try {
				s=plik.readLine();
				if (s!=null) { return true;}
				else return false;
			}
			catch (IOException e) {return false;}
		}
		@Override
		public String next() {
			return s;
		}
	}
}
