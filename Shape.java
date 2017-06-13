import java.awt.Graphics;

public interface Shape {

    /**
     * Causes the shape to draw itself using g.
     * 
     * @param g the graphics object used for drawing
     */
    public abstract void draw(Graphics g);
}
