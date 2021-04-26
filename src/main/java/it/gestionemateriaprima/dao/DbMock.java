package it.gestionemateriaprima.dao;

import java.util.ArrayList;
import java.util.List;

import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

public class DbMock {

	public static final List<MateriaPrima> MATERIA_PRIMA = new ArrayList<>();
	
	static {
		MateriaPrima materiaPrima1 = new MateriaPrima(1L, "Iodio", Stato.IN_INSERIMENTO);
		MateriaPrima materiaPrima2 = new MateriaPrima(2L, "Sabbia", Stato.IN_LAVORAZIONE);
		MateriaPrima materiaPrima3 = new MateriaPrima(3L, "Ferro", Stato.IN_VERNICIATURA);
		MateriaPrima materiaPrima4 = new MateriaPrima(4L, "Pietra", Stato.IN_MESSA_IN_OPERA);
		MATERIA_PRIMA.add(materiaPrima1);
		MATERIA_PRIMA.add(materiaPrima2);
		MATERIA_PRIMA.add(materiaPrima3);
		MATERIA_PRIMA.add(materiaPrima4);
	}
	
}
