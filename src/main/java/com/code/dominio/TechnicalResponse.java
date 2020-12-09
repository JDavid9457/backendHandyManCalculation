package com.code.dominio;

public class TechnicalResponse {
	
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	
	/**
	 *  identificación de tecnico
	 */
	private String identifyTechnical;
	/**
	 * número de la semana 
	 */
	private String  numberWeek;
	/**
	 *  horas por día 
	 */
	private double dayByHour;
	/**
	 * horas por noche 
	 */
	private double nigthByHour;
	/**
	 * horas por sabados
	 */
	private double sundayByHour;
	/**
	 * horas extra día
	 */
	private double exDayByHour;
	/**
	 * horas extra noche
	 */
	private double exNightByHour;
	/**
	 * horas extra del día sabado 
	 */
	private double exSundayByHour;

	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	
	public String getIdentifyTechnical() {
		return identifyTechnical;
	}

	public void setIdentifyTechnical(String identifyTechnical) {
		this.identifyTechnical = identifyTechnical;
	}

	public String getNumberWeek() {
		return numberWeek;
	}

	public void setNumberWeek(String numberWeek) {
		this.numberWeek = numberWeek;
	}

	public double getDayByHour() {
		return dayByHour;
	}

	public void setDayByHour(double dayByHour) {
		this.dayByHour = dayByHour;
	}

	public double getNigthByHour() {
		return nigthByHour;
	}

	public void setNigthByHour(double nigthByHour) {
		this.nigthByHour = nigthByHour;
	}

	public double getSundayByHour() {
		return sundayByHour;
	}

	public void setSundayByHour(double sundayByHour) {
		this.sundayByHour = sundayByHour;
	}

	public double getExDayByHour() {
		return exDayByHour;
	}

	public void setExDayByHour(double exDayByHour) {
		this.exDayByHour = exDayByHour;
	}

	public double getexNightByHour() {
		return exNightByHour;
	}

	public void setExNightByHour(double exNigthByHour) {
		this.exNightByHour= exNigthByHour;
	}

	public double getExSundayByHour() {
		return exSundayByHour;
	}

	public void setExSundayByHour(double exSundayByHour) {
		this.exSundayByHour = exSundayByHour;
	}


}
