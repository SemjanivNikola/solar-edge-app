package com.solar.edge.models;

public class Dimensions {
	public short width; // mm
	public short height; // mm
	public short depth; // mm
	
	public Dimensions(short width, short height, short depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public short getWidth() {
		return this.width;
	}
		
	public short getHeight() {
		return this.height;
	}
		
	public short getDepth() {
		return this.depth;
	}
}
