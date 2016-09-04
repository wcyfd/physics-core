package com.aim.physics.physics_core.entity;

public class TimeLine {
	public void sleep(long waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
