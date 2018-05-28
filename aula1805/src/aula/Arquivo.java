package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
public class Arquivo {
	
	public void inserir(String texto) throws IOException {
		//Gravação
		 FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	
	public void leitura(String texto) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
		 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	public static void main(String args[]) throws Exception {
		Arquivo arq = new Arquivo();
		arq.inserir("Jeferson");
		//arq.leitura("Jeferson Roberto de Lima");
	}
	
	
	public void alteraLinha(String palavraAntiga, String palavraNova) throws IOException {
	    String arq = "Jeferson";
	    String novoTexto = "Etec";

	    BufferedWriter writer = new BufferedWriter(new FileWriter(arq));
	    BufferedReader reader = new BufferedReader(new FileReader(novoTexto));

	    String linha;
	    while ((linha = reader.readLine()) != null) {
	        if (linha.contains(palavraAntiga)) {
	            linha = linha.replace(palavraAntiga, palavraNova);
	        } 
	        writer.write(linha + "\n");
	    }

	    writer.close();        
	    reader.close();


	    new File(arq).renameTo(new File(novoTexto));
	}

	
	
	}
	

