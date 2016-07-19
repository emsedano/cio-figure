package com.ibm.cio.model;

/**
 * The Triangle class represents a three-sided polygon with three edges and three vertices.
 * It inherits its general figure properties from the Figure abstract class, as well as the getArea abstract method (see below).
 * The tracked attributes are the height of one of its sides, and the length of its base.
 * 
 * @version 1.0
 */
public class Triangle extends Figure {
	private float fHeight;
	private float fBase;

	/**
	 * Constructor for equilateral triangles. All sides are of the same length, so only a single parameter is needed.
	 * @param float fSide
	 */
	public Triangle(float fSide) {
		this.fHeight = fSide;
		this.fBase = fSide;
		setFigureType(TypesOfFigure.triangle);
	}
	
	/**
	 * Constructor for equilateral triangles. All sides are of the same length, so only a single parameter is needed, plus the specified name.
	 * @param String sName
	 * @param float fSide
	 */
	public Triangle(String sName, float fSide) {
		this.setName(sName);
		this.fHeight = fSide;
		this.fBase = fSide;
		this.setFigureType(TypesOfFigure.triangle);
	}
	
	/**
	 * Constructor for isosceles and scalene triangles. Builds the instance based on the given height and base.
	 * @param float fHeight
	 * @param float fBase
	 */
	public Triangle(float fHeight, float fBase) {
		this.fHeight = fHeight;
		this.fBase = fBase;
		setFigureType(TypesOfFigure.triangle);
	}
	
	/**
	 * Constructor for isosceles and scalene triangles. Builds the instance based on the given height and base, plus the specified name.
	 * @param String sName
	 * @param float fHeight
	 * @param float fBase
	 */
	public Triangle(String sName, float fHeight, float fBase) {
		this.setName(sName);
		this.fHeight = fHeight;
		this.fBase = fBase;
		setFigureType(TypesOfFigure.triangle);
	}

	/**
	 * Inherited function that calculates the area of the triangle using its base and height. 
	 * The area of a triangle is (fBase*fHeight)/2.
	 * @return float fArea
	 */
	@Override
	public float getArea() {
		if (fArea != -1) {
			return fArea;
		}
		else {
			fArea = (fBase*fHeight)/2;
			return fArea;
		}
	}

	/**
	 * Getter function that returns the height of the triangle.
	 * @return float fHeight
	 */
	public float getfHeight() {
		return fHeight;
	}

	/**
	 * Setter method that defines the triangle's height.
	 * @param float fHeight
	 */
	public void setfHeight(float fHeight) {
		this.fHeight = fHeight;
	}

	/**
	 * Getter function that returns the triangle's base length.
	 * @return float fBase
	 */
	public float getfBase() {
		return fBase;
	}

	/**
	 * Setter method that defines the triangle's base.
	 * @param float fBase
	 */
	public void setfBase(float fBase) {
		this.fBase = fBase;
	}
}
