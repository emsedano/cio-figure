package com.ibm.cio.model;

/**
 * The Square class represents a basic square, which is a four-sided polygon with the same length on each of its sides.
 * It inherits its general figure properties from the Figure abstract class, as well as the getArea abstract method (see below).
 * The only attribute tracked is the length of the square's sides.
 * 
 * @version 1.0
 */
public class Square extends Figure {
	private float fSide; //Lado del cuadrado
	
	/**
	 * Square constructor that receives only the length of one of its sides.
	 * @param float fSide
	 */
	public Square (float fSide) {
		this.fSide = fSide;
		setFigureType(TypesOfFigure.square);
	}
	
	/**
	 * Square constructor that receives the length of one of its sides and the name of the square.
	 * @param String sName, float fSide
	 */
	public Square (String sName, float fSide) {
		this.setName(sName);
		this.fSide = fSide;
		setFigureType(TypesOfFigure.square);
	}
	
	
	public Square(float fSide, String color, int x, int y){
		this.fSide=fSide;
		setFigureType(TypesOfFigure.square);
		setColor(color);
		setLocation(x, y);
	}
	
	/**
	 * Inherited function that calculates the area of the square using the length of one of its sides. The area of a square is fSide^2, or fSide*fSide.
	 * @return float fArea
	 */
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		if (fArea != -1) {
			return fArea;
		}
		else {
			fArea = fSide*fSide;
			return fArea;
		}
	}

	/**
	 * Getter function that returns the length of the square's sides.
	 * @return float fSide
	 */
	public float getfSide() {
		return fSide;
	}

	/**
	 * Setter method that specifies the length of the square's sides.
	 * @param float fSide
	 */
	public void setfSide(float fSide) {
		this.fSide = fSide;
	}
}