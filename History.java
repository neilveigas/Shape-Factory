public interface History extends Iterable<Shape> {
    public void add(Shape s);
    public void undo();
    public void redo();
    public void clear();
}