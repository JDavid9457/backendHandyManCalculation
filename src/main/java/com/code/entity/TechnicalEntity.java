package com.code.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technicals")
public class TechnicalEntity {
	
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	/**
	 *  identificador 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	/**
	 * identificador de técnico
	 */
	@Column(name="identify_technicals")
	private String identifyTechnical;
	/**
	 * identificador de servicio
	 */
	@Column(name="identify_Services")
	private String identifyService;
	/**
	 * número de las semanas 
	 */
	@Column(name="number_weeks")
	private String numberWeek;
	 /**
	  * hora por día
	  */
	@Column(name="day_by_Hours")
	private float dayByHour;
	/**
	 * horas por noche 
	 */
	@Column(name="night_by_Hours")
	private float nightByHour;
	/**
	 * horas de los dás sabado
	 */
	@Column(name="sunday_by_Hours")
	private float sundayByHour;
	/**
	 * Inicio de fecha 
	 */
	@Column(name="start_Dates")
	private Date startDate;
	/**
	 * fecha final
	 */
	@Column(name="end_dates")
	private Date endDate;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
	
	public TechnicalEntity() {
		
	}

	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIdentifyTechnical() {
		return identifyTechnical;
	}


	public void setIdentifyTechnical(String identifyTechnical) {
		this.identifyTechnical = identifyTechnical;
	}


	public String getIdentifyService() {
		return identifyService;
	}


	public void setIdentifyService(String identifyService) {
		this.identifyService = identifyService;
	}


	public String getNumberWeek() {
		return numberWeek;
	}


	public void setNumberWeek(String numeberWeek) {
		this.numberWeek = numeberWeek;
	}


	public float getDayByHour() {
		return dayByHour;
	}


	public void setDayByHour(float dayByHours) {
		this.dayByHour = dayByHours;
	}


	public float getNightByHour() {
		return nightByHour;
	}


	public void setNightByHour(float nightByHours) {
		this.nightByHour = nightByHours;
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

	@Override
	public String toString() {
		return "TechnicalEntity [id=" + id + ", identifyTechnical=" + identifyTechnical + ", identifyService="
				+ identifyService + ", numberWeek=" + numberWeek + ", dayByHour=" + dayByHour + ", nightByHour="
				+ nightByHour + ", sundayByHour=" + sundayByHour + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}


	
}