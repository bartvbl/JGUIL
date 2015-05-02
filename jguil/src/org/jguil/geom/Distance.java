package org.jguil.geom;

public class Distance {
	public final double percentageValue;
	public final double pixelOffset;
	
	public Distance(double percentageValue, double pixelOffset) {
		this.percentageValue = percentageValue;
		this.pixelOffset = pixelOffset;
	}

	public double calculateSize(double parentSize) {
		return ((percentageValue / 100d) * parentSize) + pixelOffset;
	}
}
