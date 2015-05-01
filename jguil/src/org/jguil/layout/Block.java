package org.jguil.layout;

import java.util.ArrayList;

public class Block {
	public final Bounds bounds;
	public final ArrayList<Block> children;
	
	public Block() {
		this.bounds = new Bounds();
		this.children = new ArrayList<Block>();
	}
}
