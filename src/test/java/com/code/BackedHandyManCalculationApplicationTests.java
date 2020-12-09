package com.code;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.dominio.TechnicalRequest;
import com.code.dominio.TechnicalResponse;
import com.code.dominio.WorkedDays;
import com.code.service.TechnicalService;

@SpringBootTest
class BackedHandyManCalculationApplicationTests {

	
	private final String identifyTechnical="100381474";
	private final String identifyService="5794";
	
	 
	@Test
	void contextLoads() {
	}
	
	
    public TechnicalRequest TechnicalRequest() {
    	
    	
    	TechnicalRequest technical = new TechnicalRequest();
    	//WorkedDays workedDays = new WorkedDays(identifyService, 0, 0, 0, null, null);
    	List<WorkedDays> listWorkedDays = new  ArrayList<WorkedDays>();
    	//listWorkedDays.add(workedDays);
    	listWorkedDays.get(0).setDayByHour(8);
    	listWorkedDays.get(0).setNightByHour(4);
    	listWorkedDays.get(0).setSundayByHour(2);
    	listWorkedDays.get(0).setNumberWeek("8");
    	listWorkedDays.get(0).setStartDate(new Date(0));
    	listWorkedDays.get(0).setEndDate(new Date(0));
    	
    	return technical;	
	}

    @Test
    public void saveTeechnicalTest() {
    	
    	TechnicalService technicalS = new TechnicalService();
    	TechnicalRequest request = new TechnicalRequest();
    	
    	request = technicalS.save(TechnicalRequest());
    	assertNotNull(request);
    	assertEquals(request.getIdentifyTechnical(), identifyTechnical);
    	assertEquals(request.getIdentifyService(),identifyService);
    }
    
    
    @Test
	public void getTechnicalTest() {
    	TechnicalService technicalS = new TechnicalService();
    	TechnicalResponse response = new TechnicalResponse();
    	
	}
	
    
}
