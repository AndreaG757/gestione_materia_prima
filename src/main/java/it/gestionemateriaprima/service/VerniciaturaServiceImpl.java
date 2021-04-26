package it.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

@Service
public class VerniciaturaServiceImpl implements IVerniciaturaService {

	@Autowired
	private IMateriaPrimaService materiaPrimaService;
	
	@Override
	public void aggiornaStatoVerniciatura(MateriaPrima materiaPrimaInput) {
		materiaPrimaInput.setStato(Stato.IN_VERNICIATURA);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("In verniciatura la materia prima: " + materiaPrimaInput);
	}

}
