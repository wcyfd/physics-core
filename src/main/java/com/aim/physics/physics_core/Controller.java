package com.aim.physics.physics_core;

import com.aim.physics.physics_core.entity.TimeLine;
import com.aim.physics.physics_core.entity.World;

public class Controller {

	private enum Status {
		STOP, RUN
	}

	private Status status = Status.STOP;

	public Status getStatus() {
		return status;
	}

	private World world;

	public void setWorld(World world) {
		this.world = world;
	}

	private TimeLine timeLine;

	public void setTimeLine(TimeLine timeLine) {
		this.timeLine = timeLine;
	}

}
