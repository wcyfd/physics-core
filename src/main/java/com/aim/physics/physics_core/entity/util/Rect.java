package com.aim.physics.physics_core.entity.util;

public class Rect {
	public double topX;
	public double topY;
	public double leftTopX;
	public double leftTopY;
	public double rightTopX;
	public double rightTopY;
	public double leftX;
	public double leftY;
	public double rightX;
	public double rightY;
	public double leftButtomX;
	public double leftButtomY;
	public double buttomX;
	public double buttomY;
	public double rightButtomX;
	public double rightButtomY;

	private double width;
	private double height;

	public Rect(Vector2d pos, Vector2d size) {
		double x = pos.getX();
		double y = pos.getY();
		double w = pos.getX();
		double h = pos.getY();

		this.width = w;
		this.height = h;

		this.leftTopY = this.topY = this.rightTopY = y + h / 2;
		this.leftY = this.rightY = y;
		this.leftButtomY = this.buttomY = this.rightButtomY = y - h / 2;

		this.leftTopX = this.leftX = this.leftButtomX = x - w / 2;
		this.topX = this.buttomX = x;
		this.rightTopX = this.rightX = this.rightButtomY = x + w / 2;

	}
}
