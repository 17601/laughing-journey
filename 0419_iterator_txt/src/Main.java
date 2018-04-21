import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		for (String s : new IterFileWrapper("IteratorFile.txt")) {
			System.out.println(s);
		}
	}
}
