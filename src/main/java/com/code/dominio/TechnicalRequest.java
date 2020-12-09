package com.code.dominio;

import java.util.List;

public class TechnicalRequest {

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	/**
	 * lista de trabajo por días 
	 */
	private  List<WorkedDays>workedDays;
	/**
	 *  identificación de tecnico
	 */
	private String identifyTechnical;
	/**
	 * identificación de servicio
	 */
	private String identifyService;
	
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
	
	public TechnicalRequest() {
		
	}
	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

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

	public List<WorkedDays> getWorkedDays() {
		return workedDays;
	}

	public void setWorkedDays(List<WorkedDays> workedDays) {
		this.workedDays = workedDays;
	}

	
	

	
	
	
	
}
