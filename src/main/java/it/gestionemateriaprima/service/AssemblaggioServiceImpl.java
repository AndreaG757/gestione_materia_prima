package it.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

@Service
public class AssemblaggioServiceImpl implements IAssemblaggioService {

	@Autowired
	private IMateriaPrimaService materiaPrimaService;
	
	@Override
	public void aggiornaStatoAssemblaggio(MateriaPrima materiaPrimaInput) {
		materiaPrimaInput.setStato(Stato.IN_ASSEMBLAGGIO);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("In assemblaggio la materia prima: " + materiaPrimaInput);
	}
	
}
