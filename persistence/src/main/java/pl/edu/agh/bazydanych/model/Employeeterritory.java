package pl.edu.agh.bazydanych.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employeeterritories database table.
 * 
 */
@Entity
@Table(name="employeeterritories")
public class Employeeterritory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmployeeterritoryPK id;

	public Employeeterritory() {
	}

	public EmployeeterritoryPK getId() {
		return this.id;
	}

	public void setId(EmployeeterritoryPK id) {
		this.id = id;
	}

}