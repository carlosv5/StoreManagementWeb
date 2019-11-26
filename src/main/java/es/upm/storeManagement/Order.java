package es.upm.storeManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CLIENTORDER")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titulo;
	private String[] elementos;
	public Order() {}
	public Order(String titulo, String[] elementos) {
		this.titulo = titulo;
		this.elementos = elementos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getElementos() {
		return elementos;
	}
	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}
	public String getTitle() {
		return titulo;
	}

	public String[] getElement() {
		return elementos;
	}
}