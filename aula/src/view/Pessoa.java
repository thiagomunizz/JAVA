package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
	
	
	private String nome;
	private Date dtNasc;
	private List <Dependente> dependentes =
    new ArrayList <Dependente> (0);
	
	public void setDependentes
	(List<Dependente> dependentes) {
	}
	public List<Dependente> getDependentes; {
	}
		public void addDependente (Dependente dedependentes) {
			this.dependentes.add(dedependentes); {
		
			
		}
	}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Date getDtNasc() {
			return dtNasc;
		}
		public void setDtNasc(Date dtNasc) {
			this.dtNasc = dtNasc;
		}
}
