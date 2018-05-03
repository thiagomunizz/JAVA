package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class janelajava extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(40);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(40);
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField(40);
	JLabel lblRG = new JLabel("RG: ");
	JTextField txtRG = new JTextField(40);
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField(40);
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField(40);
	JLabel lblEstado = new JLabel("Estado: ");
	JComboBox cbEstado = new JComboBox();
	JTextField txtEstado = new JTextField(40);
	
	
	public janelajava() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblCPF);
		pane.add(txtCPF);
		pane.add(lblRG);
		pane.add(txtRG);
		pane.add(lblBairro);
		pane.add(txtBairro);
		pane.add(lblCidade);
		pane.add(txtCidade);
		pane.add(lblEstado);
		pane.add(cbEstado);
		cbEstado.addItem("RJ");
		cbEstado.addItem("SP");
		cbEstado.addItem("BH");
		cbEstado.addItem("MG");
		cbEstado.addItem("PE");
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		janelajava janela = new janelajava();
	}

}
