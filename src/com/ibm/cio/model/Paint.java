package com.ibm.cio.model;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.ibm.cio.ws.helper.Factory;
import com.ibm.cio.ws.helper.NameGenerator;

public class Paint {

	
	private String paintName = new String();
	private Calendar paintCalendar = Calendar.getInstance();
	private DateFormat paintDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	Factory factory;
	ArrayList<Figure> figureList;


	public Paint()
	{

		//Aqui se mandan a llamar la fabrica la cual supongo que regresara un arreglo de Figuras de clase tipo Figura
		factory = Factory.getInstance();
		figureList = factory.getListOfFigures();

		//Aqui se manda a llamar la clase que crea los nombres y asumo te regresa un String que se asigna a _Name
		paintName = NameGenerator.generateRadomName();
		

	}

	/**
	 * Esta funcion es para obtener el nombre del dibujo solicitado
	 * @return
	 */
	public String getName()
	{
		//Aqui mandas llamar 

		return this.paintName;
	}

	public String getDate()
	{
		return this.paintDateFormat.format(this.paintCalendar.getTime());

	}

	
	
}
