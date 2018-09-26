package view;

import javax.swing.JFrame;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("132.456.789-00");
         cliente.setId(1);
         cliente.setNome("Vinicius Almeida	");
         cliente.setRg("12.345.678-9");
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("Objetos salvo com sucesso!!!");
    }
} 