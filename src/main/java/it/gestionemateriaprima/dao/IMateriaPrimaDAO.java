package it.gestionemateriaprima.dao;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

public interface IMateriaPrimaDAO {

	public MateriaPrima get(Long id);
	
	public void aggiorna(MateriaPrima materiaPrimaInput);

}