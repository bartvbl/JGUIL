package org.jguil.layout;

import org.jguil.geom.Distance;
import org.jguil.geom.Rectangle;

public class Bounds {
	private Distance left;
	private Distance right;
	private Distance top;
	private Distance bottom;
	private Distance width;
	private Distance height;
	
	private SizeConfiguration verticalConfiguration;
	private SizeConfiguration horizontalConfiguration;
	
	public Rectangle calculateSize(Rectangle parent) {
		double x, y;
		double width, height; 
		double right;
		double top;
		
		switch(horizontalConfiguration) {
		case FIRST_DISTANCE_AND_WIDTH:
			x = this.left.calculateSize(parent.width);
			width = this.width.calculateSize(parent.width);
			break;
		case SECOND_DISTANCE_AND_WIDTH:
			width = this.width.calculateSize(parent.width);
			right = this.right.calculateSize(parent.width);
			x = right - width;
			break;
		case TWO_DISTANCES:
			x = this.left.calculateSize(parent.width);
			right = this.right.calculateSize(parent.width);
			width = right - x;
			break;
		default:
			throw new RuntimeException("Unsupported size measure!");
		}
		
		switch(verticalConfiguration) {
		case FIRST_DISTANCE_AND_WIDTH:
			y = this.bottom.calculateSize(parent.height);
			height = this.height.calculateSize(parent.height);
			break;
		case SECOND_DISTANCE_AND_WIDTH:
			height = this.height.calculateSize(parent.height);
			top = this.top.calculateSize(parent.height);
			y = top - height;
			break;
		case TWO_DISTANCES:
			y = this.right.calculateSize(parent.height);
			top = this.top.calculateSize(parent.height);
			height = top - y;
			break;
		default:
			throw new RuntimeException("Unsupported size measure!");
		}
		
		return new Rectangle(x, y, width, height);
	}
	
	public void setLeftAndWidth() {
		
	}
}
