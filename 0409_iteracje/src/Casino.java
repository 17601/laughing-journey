import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Iterator;


public class Casino implements Iterable<Integer> {
	int poprzednia=-1;
    int licznik=1;
    
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements Iterator<Integer> {
        Random rand = new Random();
         
        public boolean hasNext() {return licznik < 3;}
        public Integer next() {
            if(this.hasNext()) {
                int current = (int)(rand.nextDouble()*2);
                if (current==poprzednia) {++licznik;}
                else licznik=1;
                poprzednia=current;
                return current;
            }
            throw new NoSuchElementException();
        }

        
    }
}