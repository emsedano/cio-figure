package com.ibm.cio.model;

/**
 * The Circle class represents a shape that is the set of all points in a plane that are at a given distance from a given point.
 * It inherits its general figure properties from the Figure abstract class, as well as the getArea abstract method (see below).
 * The only tracked attribute is the radius between the center of the circle and any point on its edge.
 * 
 */
public class Circle extends Figure{
	private float fRadius; //Radio del c�rculo
	
	/**
	 * Circle's constructor that builds its instance based on the given radius.
	 * @param float fRadius
	 */
	public Circle(float fRadius) {
		this.fRadius = fRadius;
		this.setFigureType(TypesOfFigure.circle);
	}
	
	/**
	 * Circle's constructor that builds its instance based on the given radius, plus defining the circle's name.
	 * @param String sName
	 * @param float fRadius
	 */
	public Circle(String sName, float fRadius) {
		this.setName(sName);
		this.fRadius = fRadius;
		this.setFigureType(TypesOfFigure.circle);
	}
	
	public Circle(float fRadius, String color, int x, int y){
		this.fRadius = fRadius;
		setFigureType(TypesOfFigure.circle);
		setColor(color);
		setLocation(x, y);
	}

	/**
	 * Inherited function that calculates the area of the circle using its radius. 
	 * The area of a circle is the constant PI times the radius square.
	 * @return float fArea
	 */
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		if (fArea != -1) {
			return fArea;
		}
		else {
			fArea = (float) (Math.PI * Math.pow(fRadius, 2));
			return fArea;
		}
	}

	/**
	 * Getter function that returns the radius of the circle.
	 * @return float fRadius
	 */
	public float getfRadius() {
		return fRadius;
	}

	/**
	 * Setter function that defines the radius of the circle.
	 * @param float fRadius
	 */
	public void setfRadius(float fRadius) {
		this.fRadius = fRadius;
	}
}
