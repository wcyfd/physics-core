package com.aim.physics.physics_core.entity;

import com.aim.physics.physics_core.entity.util.Vector2d;

public class Node {
	private Vector2d position = new Vector2d();

	public void setPosition(double x, double y) {
		position.setValue(x, y);
	}

	public Vector2d getPosition() {
		return position;
	}

	
	
}
