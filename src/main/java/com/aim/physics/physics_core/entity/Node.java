package com.aim.physics.physics_core.entity;

import com.aim.physics.physics_core.entity.util.Vector2d;

public class Node {
	private Vector2d position = new Vector2d();
	private Vector2d size = new Vector2d();

	public void setPosition(double x, double y) {
		position.setValue(x, y);
	}

	public Vector2d getPosition() {
		return position;
	}

	public void setWidth(double width) {
		size.setX(width);
	}

	public double getWidth() {
		return size.getX();
	}

	public void setHeight(double height) {
		size.setY(height);
	}

	public double getHeight() {
		return size.getY();
	}

	public void setSize(double width, double height) {
		size.setValue(width, height);
	}

	public Vector2d getSize() {
		return size;
	}

	public void collision(Node node) {

	}

}
