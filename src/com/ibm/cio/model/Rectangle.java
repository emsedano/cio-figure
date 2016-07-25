package com.ibm.cio.model;

/**
 * The Rectangles class represents regular four-sided polygon which has a different length at its base than its height.
 * It inherits its general figure properties from the Figure abstract class, as well as the getArea abstract method (see below).
 * The tracked attributes are the length of the base and ceiling, and the height of its sides.
 * 
 * @version 1.0
 *
 */
public class Rectangle extends Figure {
	private float fHeight;
	private float fBase;
	
	/**
	 * Rectangle constructor that assumes only a single side's length is given. Therefore, it creates a square instead.
	 * @param float fSide
	 */
	public Rectangle (float fSide) {
		this.fHeight = fSide;
		this.fBase = fSide;
		System.err.println("Como sólo pusiste un lado, se creó un cuadrado");
		setFigureType(TypesOfFigure.square);
	}
	
	/**
	 * Rectangle constructor that assumes only a single side's length is given, plus the rectangle's name. Therefore, it creates a square instead.
	 * @param String sName
	 * @param float fSide
	 */
	public Rectangle (String sName, float fSide) {
		this.setName(sName);
		this.fHeight = fSide;
		this.fBase = fSide;
		System.err.println("Como sólo pusiste un lado, se creó un cuadrado");
		setFigureType(TypesOfFigure.square);
	}
	
	/**
	 * Rectangle constructor that builds its instance based on given height and base.
	 * @param float fHeight
	 * @param float fBase
	 */
	public Rectangle (float fHeight, float fBase) {
		this.fHeight = fHeight;
		this.fBase = fBase;
		setFigureType(TypesOfFigure.rectangle);
	}
	
	public Rectangle(float fBase, float fHeight, String color, int x, int y){
		this.fBase = fBase;
		this.fHeight = fHeight;
		setFigureType(TypesOfFigure.rectangle);
		setColor(color);
		setLocation(x, y);
	}
	
	/**
	 * Rectangle constructor that builds its instance based on given height and base, plus the rectangle's name.
	 * @param String sName
	 * @param float fHeight
	 * @param float fBase
	 */
	public Rectangle (String sName, float fHeight, float fBase) {
		this.setName(sName);
		this.fHeight = fHeight;
		this.fBase = fBase;
		setFigureType(TypesOfFigure.rectangle);
	}
	
	/**
	 * Inherited function that calculates the area of the square using the length of one of its sides. 
	 * The area of a rectangle is fBase*fHeight.
	 * @return float fArea
	 */
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		if (fArea != -1) {
			return fArea;
		}
		else {
			fArea = fBase*fHeight;
			return fArea;
		}
	}

	/**
	 * Getter function that returns the height of the rectangle.
	 * @return float fHeight
	 */
	public float getfHeight() {
		return fHeight;
	}
	
	/**
	 * Setter method that defines the height of the rectangle.
	 * @param float fHeight
	 */
	public void setfHeight(float fHeight) {
		this.fHeight = fHeight;
	}

	/**
	 * Getter function that returns the base's length of the rectangle.
	 * @return float fBase
	 */
	public float getfBase() {
		return fBase;
	}

	/**
	 * Setter method that defines the base's length of the rectangle.
	 * @param float fBase
	 */
	public void setfBase(float fBase) {
		this.fBase = fBase;
	}
	
}