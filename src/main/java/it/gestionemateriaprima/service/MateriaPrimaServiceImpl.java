package it.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionemateriaprima.dao.IMateriaPrimaDAO;
import it.gestionemateriaprima.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements IMateriaPrimaService {

	@Autowired
	private IMateriaPrimaDAO materiaPrimaDAO;
	
	@Override
	public MateriaPrima get(Long id) {
		return materiaPrimaDAO.get(id);
	}
	
	@Override
	public void aggiorna(MateriaPrima materiaPrimaInput) {
		materiaPrimaDAO.aggiorna(materiaPrimaInput);
	}

}
