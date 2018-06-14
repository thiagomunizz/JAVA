package view;

import java.util.Date;

public class Dependente {
	
	private String nome;
	private Date dtnasc;
	private String grauParentesco;
	private Pessoa responsavel;
	
	public void setResponsavel (Pessoa resp) {
		
	}
	public Pessoa getResponsavel() {
		return responsavel;
		
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

}
