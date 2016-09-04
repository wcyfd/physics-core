package com.aim.physics.physics_core;

import java.util.List;

import com.aim.physics.physics_core.entity.Node;
import com.aim.physics.physics_core.entity.World;
import com.aim.physics.physics_core.entity.util.Vector2d;

public class CollisionDetector {
	private World world;

	public void setWorld(World world) {
		this.world = world;
	}

	public void detect() {
		if (world == null)
			return;
		List<Node> nodes = world.getContainer();
		for (Node node1 : nodes) {
			for (Node node2 : nodes) {
				if (isCollision(node1, node2)) {
					node1.collision(node2);
				}
			}
		}
	}

	public boolean isCollision(Node node1, Node node2) {
		if (node1 == node2)
			return false;

		Vector2d pos = node1.getPosition();
		Vector2d size = node1.getSize();
		
		return true;
	}

}
