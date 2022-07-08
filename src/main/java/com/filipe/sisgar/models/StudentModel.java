package com.filipe.sisgar.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudentModel extends PersonModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String registration;
	private String curse;
	private String cep;
	private String city;
	private String uf;
	
	public StudentModel() {
		super();
	}
	public StudentModel(Long id, String name, String surname, @CPF String cpf, String phone, String email, String address, 
			Date birth, String password, String registration, String curse, String cep, String city, String uf) {
		super(id, name, surname, cpf, phone, email, address, birth, password);
		
		this.registration = registration;
		this.curse = curse;
		this.cep = cep;
		this.city = city;
		this.uf = uf;
		
	}
	
	
}
