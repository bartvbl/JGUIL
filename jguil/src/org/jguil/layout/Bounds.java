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
	
	public Rectangle calculate(Rectangle parent) {
		return new Rectangle(0, 0, 0, 0);
	}
}
