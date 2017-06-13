import java.awt.Graphics;


public class Triangle implements Shape {
	private int x;
	private int y;
	private int radius;
	public Triangle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		//g.drawOval(this.x, this.y, this.radius, this.radius);
		double degrees = Math.toRadians(30.0);
		double length = this.radius * (Math.cos(degrees));
		double height = this.radius * (Math.sin(degrees));
		int[] xvalues = {(this.x), (this.x + (int)length), (this.x - (int)length)};
		int[] yvalues = {(this.y + this.radius), (this.y - (int)height), (this.y - (int)height)};
		g.drawPolygon(xvalues, yvalues, 3);


		// TODO Auto-generated method stub


	}

}
