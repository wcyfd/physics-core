package com.aim.physics.physics_core;

import com.aim.physics.physics_core.entity.Rect;
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
		TimeLine timeLine = new TimeLine();
		Rect rect1 = new Rect();
		Rect rect2 = new Rect();

		w.setSize(new Vector2d(100, 120));

		rect1.setWidth(20);
		rect1.setHeight(30);
		rect2.setWidth(20);
		rect2.setHeight(30);

		rect1.setPosition(10, 10);
		rect2.setPosition(10, 30);
		w.addEntity(rect1);
		w.addEntity(rect2);

		while (true) {
			timeLine.sleep(1000);
			w.update(0.01f);
		}
	}
}
