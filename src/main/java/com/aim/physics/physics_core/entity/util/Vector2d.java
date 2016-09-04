package com.aim.physics.physics_core.entity.util;

import java.util.Vector;

public class Vector2d {
	private double x;
	private double y;

	public Vector2d() {
		this.x = 0;
		this.y = 0;
	}

	public Vector2d(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setValue(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Vector2d add(Vector2d v) {
		this.x += v.x;
		this.y += v.y;
		return this;
	}

	public Vector2d substract(Vector2d v) {
		this.x -= v.x;
		this.y -= v.y;
		return this;
	}

	public Vector2d multiple(Vector2d v) {
		this.x *= v.x;
		this.y *= v.y;
		return this;
	}

	public Vector2d divided(Vector2d v) {
		this.x /= v.x;
		this.y /= v.y;
		return this;
	}

	public Vector2d multiple(double v) {
		this.x *= v;
		this.y *= v;
		return this;
	}

	public Vector2d divided(double v) {
		this.x /= v;
		this.y /= v;
		return this;
	}

	public Vector2d clone() {
		return new Vector2d(this.x, this.y);
	}

	@Override
	public String toString() {
		return "[x=" + x + ",y=" + y + "]";
	}
}
