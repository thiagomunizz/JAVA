package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {
	
	public static void main(String args[]) throws Exception {
		
		 //Grava��o
		 /*FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 0; i < 1000; i++) {
			 gravarArq.println("valor de i: " + i); 
		 }
		 arq.close();*/
		
		 //Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains("ana")) {
	    		 System.out.println("linha: " + i + " conte�do: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     } 
	     
	     arqleitura.close();
	}
}
