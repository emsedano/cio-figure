package com.ibm.cio.ws.helper;

import java.util.ArrayList;
import java.util.Random;

import com.ibm.cio.model.*;

public class Factory {
	
	private static Factory factory;
	
	private ArrayList<Figure> figureDump;
	private int numberOfFigures;
	private Random randomInt = new Random();
	
	private Factory() {
		init();
	}
	
	public static Factory getInstance() {
		if(factory == null){
			return new Factory();
		}
		return factory;
	}
	
	private void init() {
		figureDump = new ArrayList<Figure>();
		numberOfFigures = randomInt.nextInt(10);
		System.out.println("Factory running..." + numberOfFigures);
		fillFigureDump();
	}
	
	private void fillFigureDump() {
		for(int i = 0; i < numberOfFigures; i++) {
			figureDump.add(getRandomFigure());
			System.out.println("Factory creating figure ..." + "[" + i + "]->" + figureDump.get(i).getType());
		}
	}

	
	private Figure getRandomFigure() {
		Figure tempFigure;
		int tipoFigura;
		
		tipoFigura = randomInt.nextInt(4);
		tempFigure = null;
		
		switch(tipoFigura) {
			case 0:
				tempFigure =  (Figure) new Square(getRandomMeasure(),
											getRandomHexColor(),
											getRandomX(),
											getRandomY());
				break;
			case 1:
				tempFigure =   (Figure) new Rectangle(getRandomMeasure(),getRandomMeasure(),
												getRandomHexColor(),
												getRandomX(),
												getRandomY());
				break;
			case 2:
				tempFigure =   (Figure) new Triangle(getRandomMeasure(),getRandomMeasure(),
												getRandomHexColor(),
												getRandomX(),
												getRandomY());
				break;
			case 3:
				tempFigure =   (Figure) new Circle(getRandomMeasure(),
											getRandomHexColor(),
											getRandomX(),
											getRandomY());
				break;
		}
		
		return  tempFigure;
	}
	
	private float getRandomMeasure() {
		return randomInt.nextFloat()*300;
	}
	
	private String getRandomHexColor() {
		return (Long.toHexString((long) randomInt.nextInt(16777215)));
	}
	
	private int getRandomX() {
		return randomInt.nextInt(600);
	}
	
	private int getRandomY() {
		return randomInt.nextInt(1200);
	}
	
	public ArrayList<Figure> getListOfFigures() {
		return figureDump;
	}
	

		
	public static void main(String args[]) {
		Factory fack = Factory.getInstance();
		ArrayList<Figure> figureDump = fack.getListOfFigures();
		
		System.out.println("Printing ..." + figureDump.size());
		
		for(Figure temp: figureDump) {
			System.out.println("Printing ..." + temp.getType());
		}
	}
}
