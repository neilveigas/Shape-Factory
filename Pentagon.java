import java.awt.Graphics;


public class Pentagon implements Shape {
	private int x;
	private int y;
	private int radius;
	public Pentagon(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//g.drawOval(this.x, this.y, this.radius, this.radius);
		double degrees = Math.toRadians(36.0);
		double length = 2 * this.radius * (Math.sin(degrees));
		double bottomy = Math.sqrt((this.radius * this.radius) - (length * length / 4));
		double topx = length * (Math.cos(degrees));
		double topy = Math.sqrt((this.radius * this.radius) - (topx * topx));
		int[] xvalues = {(this.x), (this.x + (int)topx), (this.x +
				(int)(length / 2)), (this.x - (int)(length / 2)), (this.x - (int)topx)};
		int[] yvalues = {(this.y + this.radius), (this.y +
				(int)topy), (this.y - (int)(bottomy)), (this.y - (int)(bottomy)), (this.y + (int)topy)};
		g.drawPolygon(xvalues, yvalues, 5);

	}

}
