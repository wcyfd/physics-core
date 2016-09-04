package com.aim.physics.physics_core.entity;

import java.util.ArrayList;
import java.util.List;

import com.aim.physics.physics_core.entity.util.Vector2d;

public class World {
	
	private Vector2d worldSize = new Vector2d();

	private List<Node> container = new ArrayList<>();

	public void setSize(Vector2d size) {
		this.worldSize = size;
	}

	public Vector2d getSize() {
		return worldSize;
	}

	public List<Node> getContainer() {
		return container;
	}

	public void addEntity(Node entity) {
		if (container.contains(entity))
			return;
		container.add(entity);
	}
	public void update(float dt) {

	}
}
