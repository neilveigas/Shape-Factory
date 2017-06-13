import java.util.Iterator;
import java.util.LinkedList;


public class MyHistory implements History {
	private LinkedList<Shape> hist = new LinkedList<Shape>();
	private LinkedList<Shape> undone = new LinkedList<Shape>();
	
	public MyHistory() {
		this.hist = new LinkedList<Shape>();
		this.undone = new LinkedList<Shape>();
	}
	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		/*Iterator<Shape> itr = hist.iterator();
		while(itr.hasNext()) {
	         Object element = itr.next();
	         return element;
	      }*/
		return hist.iterator();
	}

	@Override
	public void add(Shape s) {
		// TODO Auto-generated method stub
		hist.add(s);
		undone.clear();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (hist.size() > 0) {
			Shape last = hist.getLast();
			hist.removeLast();
			undone.add(last);	
		}
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		if (undone.size() > 0) {
			Shape previous = undone.getLast();
			hist.add(previous);
			undone.removeLast();
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		hist.clear();
		undone.clear();
	}

}
