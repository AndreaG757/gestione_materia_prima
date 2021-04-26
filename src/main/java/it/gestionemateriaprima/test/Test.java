package it.gestionemateriaprima.test;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.service.ILavorazioneService;
import it.gestionemateriaprima.service.IMateriaPrimaService;
import it.gestionemateriaprima.spring.MyServiceFactory;

public class Test {

	public static void main(String[] args) {
		
		IMateriaPrimaService materiaPrimaService = MyServiceFactory.getMateriaPrimaService();
		ILavorazioneService lavorazioneService = MyServiceFactory.getLavorazioneService();
		
		try {
			MateriaPrima materiaPrima = materiaPrimaService.get(3L);
			lavorazioneService.inviaInLavorazione(materiaPrima);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
