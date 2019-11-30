package es.upm.storeManagement;

import java.util.ArrayList;

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
	private boolean[] checkbox;
	public Order() {}
	public Order(String titulo, String[] elementos) {
		this.titulo = titulo;
		this.elementos = elementos;
	}
	public boolean[] getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean[] boxes) {
		this.checkbox = boxes;
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
	
	public long getId() {
		return id;
	}
}