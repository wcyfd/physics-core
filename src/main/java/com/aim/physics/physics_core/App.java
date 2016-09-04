package com.aim.physics.physics_core;

import com.aim.physics.physics_core.entity.Node;
import com.aim.physics.physics_core.entity.TimeLine;
import com.aim.physics.physics_core.entity.World;
import com.aim.physics.physics_core.entity.util.Vector2d;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		World w = new World();
		w.setSize(new Vector2d(100, 120));

		TimeLine timeLine = new TimeLine();

		Node rect1 = new Node();
		Node rect2 = new Node();

		rect1.setSize(20, 30);
		rect2.setSize(20, 30);

		rect1.setPosition(10, 10);
		rect2.setPosition(10, 30);

		w.addNode(rect1);
		w.addNode(rect2);

		CollisionDetector cd = new CollisionDetector();

		CollisionResolution cr = new CollisionResolution();

		while (true) {
			timeLine.sleep(1000);
			w.update(0.01f);
			cd.detect();
			cr.resolution();
		}
	}
}
