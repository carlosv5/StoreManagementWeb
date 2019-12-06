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
	private String title;
	private String[] elements;
	private boolean[] checkbox;
	public Order() {}
	public Order(String title, String[] elements) {
		this.title = title;
		this.elements = elements;
	}
	public Order(String title, String[] elements, boolean[] checkbox) {
		this.title = title;
		this.elements = elements;
		this.checkbox = checkbox;
	}
	public boolean[] getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean[] boxes) {
		this.checkbox = boxes;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setElements(String[] elements) {
		this.elements = elements;
	}
	public String getTitle() {
		return title;
	}

	public String[] getElements() {
		return elements;
	}
	
	public long getId() {
		return id;
	}
}