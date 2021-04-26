package it.gestionemateriaprima.dao;

import org.springframework.stereotype.Component;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

@Component
public class MateriaDAOImpl implements IMateriaPrimaDAO {

	@Override
	public MateriaPrima get(Long id) {
		for (MateriaPrima item : DbMock.MATERIA_PRIMA) {
			if (item.getId() == id) 
				return item;
		}
		return null;
	}

	@Override
	public void aggiorna(MateriaPrima materiaPrimaInput) {
		for (MateriaPrima item : DbMock.MATERIA_PRIMA) {
			if (item.getId() == materiaPrimaInput.getId()) {
				item.setStato(materiaPrimaInput.getStato());
				item.setDescrizione(materiaPrimaInput.getDescrizione());
			}
		}
	}

}
