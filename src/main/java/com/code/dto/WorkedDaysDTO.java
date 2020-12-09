package com.code.dto;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;

public class WorkedDaysDTO {

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	
	/**
	 * número de la semana 
	 */
	private String numberWeek;
	/**
	 *  horas por día 
	 */
	private float dayByHour;
	/**
	 * horas por noche 
	 */
	private float nightByHour;
	/**
	 * horas por sabados
	 */
	private float sundayByHour;
	/**
	 * fecha inicial
	 */
	private Date startDate;
	/**
	 * fecha final 
	 */
	private Date endDate;
	


	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	public WorkedDaysDTO(String numberWeek,float dayByHour, float nightByHour, float sundayByHour,  Date startDate, Date endDate) {
		super();
		this.numberWeek =numberWeek;
		this.dayByHour = dayByHour;
		this.nightByHour = nightByHour;
		this.sundayByHour= sundayByHour;
		this.startDate = startDate;
		this.endDate= endDate;
	}
	
	
	public String getNumberWeek() {
		return numberWeek;
	}
	
	public void setNumberWeek(String numberWeek) {
		this.numberWeek = numberWeek;
	}
	
	public float getDayByHour() {
		return dayByHour;
	}
	
	public void setDayByHour(float dayByHour) {
		this.dayByHour = dayByHour;
	}
	
	public float getNightByHour() {
		return nightByHour;
	}
	
	public void setNightByHour(float nightByHour) {
		this.nightByHour = nightByHour;
	}
	
	public float getSundayByHour() {
		return sundayByHour;
	}
	
	public void setSundayByHour(float sundayByHour) {
		this.sundayByHour = sundayByHour;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	
	
	
}
