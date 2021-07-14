package com.felipepestana.projeto1.dto;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

import com.felipepestana.projeto1.models.Professor;
import com.felipepestana.projeto1.models.StatusProfessor;
import com.sun.istack.NotNull;

public class RequisicaoProfessor {

	@NotBlank
	@NotNull
	private String nome;
	@NotNull
	@DecimalMin("0.0")
	private BigDecimal salario;
	private StatusProfessor statusProfessor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public StatusProfessor getStatusProfessor() {
		return statusProfessor;
	}

	public Professor toProfessor() {
		Professor professor = new Professor();
		professor.setNome(this.nome);
		professor.setSalario(this.salario);
		professor.setStatusProfessor(this.statusProfessor);
		return professor;

	}

	public void setStatusProfessor(StatusProfessor statusProfessor) {
		this.statusProfessor = statusProfessor;
	}

}
