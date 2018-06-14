package view;

import java.util.ArrayList;

public class Time {
	
	private String nomeAtleta;
	private ArrayList<Atleta> Atleta;
	public Time() {
		
		Atleta = new ArrayList<Atleta>();
	}

	
	public void add(Atleta umAtleta) {
		Atleta.add(umAtleta);
	}


	public String getNomeAtleta() {
		return nomeAtleta;
	}


	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}
}
