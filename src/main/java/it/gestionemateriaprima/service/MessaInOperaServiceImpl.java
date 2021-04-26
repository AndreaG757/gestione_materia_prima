package it.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

@Service
public class MessaInOperaServiceImpl implements IMessaInOperaService {
	
	@Autowired
	private IMateriaPrimaService materiaPrimaService;
	
	@Override
	public void aggiornaStatoMessaInOpera(MateriaPrima materiaPrimaInput) {
		materiaPrimaInput.setStato(Stato.IN_MESSA_IN_OPERA);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("Messa in opera della materia prima: " + materiaPrimaInput);
	}
	
}
