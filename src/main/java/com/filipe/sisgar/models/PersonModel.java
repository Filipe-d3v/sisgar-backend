package com.filipe.sisgar.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.br.CPF;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public abstract class PersonModel {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	@EqualsAndHashCode.Include
	@CPF
	private String cpf;
	private String phone;
	@EqualsAndHashCode.Include
	private String email;
	private String address;
	private Date birth;
	private String password;
	
	public PersonModel() {
		super();
	}

	public PersonModel(Long id, String name, String surname, @CPF String cpf, String phone, String email, String address,
			Date birth, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	
	
}
