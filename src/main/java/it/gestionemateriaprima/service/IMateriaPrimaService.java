package it.gestionemateriaprima.service;

import it.gestionemateriaprima.model.MateriaPrima;

public interface IMateriaPrimaService {

	public void aggiorna(MateriaPrima materiaPrimaInput);
	
	public MateriaPrima get(Long id); 
	
}
