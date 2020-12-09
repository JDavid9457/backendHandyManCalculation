package com.code.service;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dominio.TechnicalRequest;
import com.code.dominio.TechnicalResponse;
import com.code.entity.TechnicalEntity;
import com.code.repository.TechnicalRepository;

@Service("TechnicalService")
public class TechnicalService  implements TechnicalInterfacesService{

	@Autowired
	private TechnicalRepository technicalRepository;
	
	
	/**
	 * Metodo encargando de listar la informacion del técnico 
	 */
	@Override
	public List<TechnicalEntity> list() {
		// TODO Auto-generated method stub
		return technicalRepository.findAll();
	}
	

	/**
	 * Metodo encargado de guardar los datos del técnico, como la identificacion,
	 * identificacion de servicio, fecha de inicio y horas.
	 */
	public TechnicalRequest save(TechnicalRequest tr) {
		
		try {
			for (int i = 0; i < tr.getWorkedDays().size(); i++) {
				TechnicalEntity technicalEntity = new TechnicalEntity();
				technicalEntity.setIdentifyTechnical(tr.getIdentifyTechnical());
				technicalEntity.setIdentifyService(tr.getIdentifyService());
				technicalEntity.setNumberWeek(tr.getWorkedDays().get(i).getNumberWeek());		
				technicalEntity.setDayByHour(tr.getWorkedDays().get(i).getDayByHour());
				technicalEntity.setNightByHour(tr.getWorkedDays().get(i).getNightByHour());
				technicalEntity.setSundayByHour(tr.getWorkedDays().get(i).getSundayByHour());
				technicalEntity.setStartDate(tr.getWorkedDays().get(i).getStartDate());	
				technicalEntity.setEndDate(tr.getWorkedDays().get(i).getEndDate());
				technicalRepository.save((technicalEntity));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return tr;
	}
	
	
	/**
	 * 
	 */
	public double calculation(double calculation) {
		
		double num = 0;
		num = 48 -calculation;
		return calculation;
	}
	
	/**
	 * Metodo encargado de realizar, calculo de las 
	 * semanas y hoaras extra.
	 */
	public TechnicalResponse getTechnicalCalculation(String identify, String numberW) {
		
		 double cont =0;
		 double dayByHour=0;
		 double nigthByHour=0;
		 double sundayByHour=0;
		 double exDayByHour=0;
		 double exNightByHour=0;
		 double exSundayByHour=0;
	
		TechnicalResponse technicalResponse = new TechnicalResponse();
		List<TechnicalEntity> tr = new ArrayList<TechnicalEntity>();
		tr = technicalRepository.findByIdentifyTechnicalAndNumberWeekOrderByEndDate(identify,numberW);
		
		if(tr.isEmpty()) {
			
			technicalResponse.setDayByHour(dayByHour);
			technicalResponse.setNigthByHour(nigthByHour);
			technicalResponse.setSundayByHour(sundayByHour);
			technicalResponse.setExDayByHour(exDayByHour);
			technicalResponse.setExNightByHour(exNightByHour);
			technicalResponse.setExSundayByHour(exSundayByHour);
			
		}else {
			for (int i = 0; i <tr.size(); i++) {
				if(cont <48.0) {
					if(tr.get(i).getDayByHour()+cont >= 48){
						exDayByHour = calculation(cont);
						cont = 48;
					}else {
						dayByHour = dayByHour + tr.get(i).getDayByHour();
						cont = cont + tr.get(i).getDayByHour();
					}
					if(tr.get(i).getNightByHour()+ cont >= 48) {
						exNightByHour = calculation(cont);
						cont = 48;
					}else {
						nigthByHour = nigthByHour +tr.get(i).getNightByHour();
						cont = cont + tr.get(i).getNightByHour();
					}
					
					if(tr.get(i).getSundayByHour()+ cont >= 48) {
						exSundayByHour = calculation(cont);
						cont =48;
					}
					else {
						sundayByHour = sundayByHour + tr.get(i).getSundayByHour();
						cont = cont + tr.get(i).getSundayByHour();
					}
					
				}else {
					exDayByHour = exDayByHour + tr.get(i).getDayByHour();
					exNightByHour = exNightByHour + tr.get(i).getNightByHour();
				}
			}
			
			
			technicalResponse.setDayByHour(dayByHour);
			technicalResponse.setNigthByHour(nigthByHour);
			technicalResponse.setSundayByHour(sundayByHour);
			technicalResponse.setExDayByHour(exSundayByHour);
			technicalResponse.setExNightByHour(exNightByHour);
			technicalResponse.setExSundayByHour(exSundayByHour);
			technicalResponse.setIdentifyTechnical(tr.get(0).getIdentifyTechnical());
			technicalResponse.setNumberWeek(tr.get(0).getNumberWeek());
			
		}
			
		return technicalResponse;	
	}
	
	

}
