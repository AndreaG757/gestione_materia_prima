package it.gestionemateriaprima.model;

public class MateriaPrima {

	private Long id;
	private String descrizione;
	private Stato stato;
	
	public MateriaPrima() {}

	public MateriaPrima(Long id, String descrizione, Stato stato) {
		this.id = id;
		this.descrizione = descrizione;
		this.stato = stato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "MateriaPrima [id=" + id + ", descrizione=" + descrizione + ", stato=" + stato + "]";
	}
	
}
