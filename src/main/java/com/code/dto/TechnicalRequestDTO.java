package com.code.dto;

import java.util.List;

public class TechnicalRequestDTO {

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	/**
	 * lista de trabajo por días 
	 */
	private  List<WorkedDaysDTO>workedDays;
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
	
	
	public TechnicalRequestDTO() {
		
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

	public List<WorkedDaysDTO> getWorkedDays() {
		return workedDays;
	}

	public void setWorkedDays(List<WorkedDaysDTO> workedDays) {
		this.workedDays = workedDays;
	}

	
	

	
	
	
	
}
