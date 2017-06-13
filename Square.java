import java.awt.Graphics;


public class Square implements Shape {
	private int x;
	private int y;
	private int radius;
	public Square(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//g.drawOval(this.x, this.y, this.radius, this.radius);
		int[] xvalues = {(this.x - (int)((Math.sqrt(2) * this.radius) / 2)), (this.x +
				(int)((Math.sqrt(2) * this.radius) / 2)), (this.x +
				(int)((Math.sqrt(2) * this.radius) / 2)), (this.x - (int)((Math.sqrt(2) * this.radius) / 2))};
		int[] yvalues = {(this.y + (int)((Math.sqrt(2) * this.radius) / 2)), (this.y +
				(int)((Math.sqrt(2) * this.radius) / 2)), (this.y -
				(int)((Math.sqrt(2) * this.radius) / 2)), (this.y - (int)((Math.sqrt(2) * this.radius) / 2))};
		g.drawPolygon(xvalues, yvalues, 4);

	}

}
