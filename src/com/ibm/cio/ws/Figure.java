package com.ibm.cio.ws;

/**
 * Abstract class that will represent the generic properties of a geometrical figure (basically name and area). The TypesOfFigure enum will define the 
 * four different figures: square, rectangle, circle and triangle. But the Figure class gives the basic properties needed by each geometrical figure.
 * 
 * The Figure class cannot be instanced. 
 * 
 */
public abstract class Figure {
	//tipo de figura
	private TypesOfFigure eFigureType;
	//nombre de la figura definida por el usuario
	private String sName = new String();
	//valor del area de la figura del modificador de acceso PROTECTED le permite a las clases heredar a una sola.
	protected float fArea=-1;
	
	/**
	 * Function that specifies which kind of figure is the instance executing it. (See TypesOfFigure enum for additional details).
	 * @return TypesOfFigure eFigureType
	 */
	public TypesOfFigure geteFigureType() {
		return eFigureType;
	}
	
	//Getters y setters
	//Figure Type
	/**
	 * Setter method that specifies the type of Figure.
	 * @param TypesOfFigure eType
	 */
	public void setFigureType (TypesOfFigure eType) {
		this.eFigureType = eType;
	}
	
	/**
	 * Getter function that returns which kind of figure this is.
	 * @return TypesOfFigure eFigureType
	 */
	public TypesOfFigure getType() {
		return this.eFigureType;
	}
	
	//Name
	/**
	 * Setter method that specifies the name of the Figure.
	 * @param String sName
	 */
	public void setName(String sName) {
		this.sName = sName;
	}
	
	/**
	 * Getter function that returns the name of the Figure.
	 * @return String sName
	 */
	public String getName() {
		return this.sName;
	}
	
	//getArea - getter abstracto
	/**
	 * Abstract method that will be inherited by each Figure type in order for them to calculate their area.
	 * @return float fArea
	 */
	abstract public float getArea();
	
}
