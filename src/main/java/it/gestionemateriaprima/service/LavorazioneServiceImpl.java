package it.gestionemateriaprima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gestionemateriaprima.dao.IMateriaPrimaDAO;
import it.gestionemateriaprima.model.MateriaPrima;
import it.gestionemateriaprima.model.Stato;

@Service
public class LavorazioneServiceImpl implements ILavorazioneService {
	
	@Autowired
	private IAssemblaggioService assemblaggioService;
	
	@Autowired
	private IMessaInOperaService messaInOperaService;
	
	@Autowired 
	private IVerniciaturaService verniciaturaService;
	
	@Autowired
	private IMateriaPrimaDAO materiaDAO; 

	@Override
	public void inviaInLavorazione(MateriaPrima materiaPrimaInput) {
		System.out.println("---------- Inizio Lavorazione ----------");
		assemblaggioService.aggiornaStatoAssemblaggio(materiaPrimaInput);
		messaInOperaService.aggiornaStatoMessaInOpera(materiaPrimaInput);
		verniciaturaService.aggiornaStatoVerniciatura(materiaPrimaInput);
		materiaPrimaInput.setStato(Stato.PRONTA);
		System.out.println("---------- Fine Lavorazione ----------");
		System.out.println(materiaPrimaInput);
	}

	public IAssemblaggioService getAssemblaggioService() {
		return assemblaggioService;
	}

	public void setAssemblaggioService(IAssemblaggioService assemblaggioService) {
		this.assemblaggioService = assemblaggioService;
	}

	public IMessaInOperaService getMessaInOperaService() {
		return messaInOperaService;
	}

	public void setMessaInOperaService(IMessaInOperaService messaInOperaService) {
		this.messaInOperaService = messaInOperaService;
	}

	public IVerniciaturaService getVerniciaturaService() {
		return verniciaturaService;
	}

	public void setVerniciaturaService(IVerniciaturaService verniciaturaService) {
		this.verniciaturaService = verniciaturaService;
	}

	public IMateriaPrimaDAO getMateriaDAO() {
		return materiaDAO;
	}

	public void setMateriaDAO(IMateriaPrimaDAO materiaDAO) {
		this.materiaDAO = materiaDAO;
	}
	
}
