package org.jguil.geom;

public class Rectangle {
	public final double x, y;
	public final double width, height;
	public final double left, right, bottom, top;
	
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.left = x;
		this.bottom = y;
		this.right = x + width;
		this.top = y + height;
	}
}
