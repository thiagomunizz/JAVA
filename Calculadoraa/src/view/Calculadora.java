package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculos.FuncoesMatematicas;


public class Calculadora extends JFrame{
	
	JTextField txtvisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMMais = new JButton("M+");
	JButton btnMMenos = new JButton("M-");
	JButton btnSeta = new JButton("<--");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaiseMenos = new JButton("+/-");
	JButton btnRaiz = new JButton("V");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDivi = new JButton("/");
	JButton btnPorc = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btnUmbarraX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMais = new JButton("+");
	
	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null;
	double valor1 = 0, valor2 = 0, ms = 0;
	
	
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtvisor.setBounds(20, 30, 188, 50);
		paine.add(txtvisor);
		
		btnMC.setBounds(20, 85 , 34, 27);
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 ms = 0;
		     }
		});
	
		
		btnMR.setBounds(58, 85 , 34, 27);
		btnMR.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMR);
		btnMR.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 txtvisor.setText(ms + "");
		     }
		});
		
		btnMS.setBounds(96, 85, 34, 27);
		btnMS.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		btnMS.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 ms = Double.parseDouble(txtvisor.getText());
		     }
		});
		
		btnMMais.setBounds(134, 85 , 34, 27);
		btnMMais.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMMais);
		btnMMais.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 ms += Double.parseDouble(txtvisor.getText());
		     }
		});
		
		btnMMenos.setBounds(172, 85 , 34, 27);
		btnMMenos.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMMenos);
		btnMMenos.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 ms -= Double.parseDouble(txtvisor.getText());
		     }
		});
		
		btnSeta.setBounds(20, 116 , 34, 27);
		btnSeta.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnSeta.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeta);
		
		btnCE.setBounds(58, 116 , 34, 27);
		btnCE.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnCE.setMargin(new Insets(1,1,1,1));
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 txtvisor.setText("0");
		     }
		});
		
		btnC.setBounds(96, 116 , 34, 27);
		btnC.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 txtvisor.setText("0");
		     }
		});
		
		btnMaiseMenos.setBounds(134, 116 , 34, 27);
		btnMaiseMenos.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMaiseMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaiseMenos);
		
		btnRaiz.setBounds(172, 116 , 34, 27);
		btnRaiz.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnRaiz.setMargin(new Insets(1,1,1,1));
		paine.add(btnRaiz);
		btnRaiz.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		     valor1 = Double.parseDouble(txtvisor.getText());
		    	 txtvisor.setText(mat.raiz(valor1) + "");
		     }
		});
		
		btnSete.setBounds(20, 149 , 34, 27);
		btnSete.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnSete.setMargin(new Insets(1,1,1,1));
		paine.add(btnSete);
		btnSete.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("7");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "7");
		    	     }
		    	 }
		     });
		
		btnOito.setBounds(58, 149 , 34, 27);
		btnOito.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnOito.setMargin(new Insets(1,1,1,1));
		paine.add(btnOito);
		btnOito.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("8");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "8");
		    	     }
		    	 }
		     });
		
		btnNove.setBounds(96, 149 , 34, 27);
		btnNove.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnNove.setMargin(new Insets(1,1,1,1));
		paine.add(btnNove);
		btnNove.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("9");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "9");
		    	     }
		    	 }
		     });
		
		btnDivi.setBounds(134, 149 , 34, 27);
		btnDivi.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnDivi.setMargin(new Insets(1,1,1,1));
		paine.add(btnDivi);
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtvisor.getText());
				sinal = "divisao";
				txtvisor.setText("0");
			}
		});
		
		btnPorc.setBounds(172, 149 , 34, 27);
		btnPorc.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnPorc.setMargin(new Insets(1,1,1,1));
		paine.add(btnPorc);
		
		btnQuatro.setBounds(20, 182 , 34, 27);
		btnQuatro.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnQuatro.setMargin(new Insets(1,1,1,1));
		paine.add(btnQuatro);
		btnQuatro.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("4");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "4");
		    	     }
		    	 }
		     });
		
		btnCinco.setBounds(58, 182 , 34, 27);
		btnCinco.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnCinco.setMargin(new Insets(1,1,1,1));
		paine.add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("5");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "5");
		    	     }
		    	 }
		     });
		
		btnSeis.setBounds(96, 182 , 34, 27);
		btnSeis.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnSeis.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("6");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "6");
		    	     }
		    	 }
		     });
		
		btnMult.setBounds(134, 182 , 34, 27);
		btnMult.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMult.setMargin(new Insets(1,1,1,1));
		paine.add(btnMult);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtvisor.getText());
				sinal = "multiplicacao";
				txtvisor.setText("0");
			}
		});
		
		btnUmbarraX.setBounds(172, 182 , 34, 27);
		btnUmbarraX.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnUmbarraX.setMargin(new Insets(1,1,1,1));
		paine.add(btnUmbarraX);
		btnUmbarraX.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		     valor1 = Double.parseDouble(txtvisor.getText());
		    	 txtvisor.setText(mat.reciprocal(valor1) + "");
		     }
		});
		
		btnUm.setBounds(20, 215 , 34, 27);
		btnUm.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnUm.setMargin(new Insets(1,1,1,1));
		paine.add(btnUm);
		btnUm.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("1");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "1");
		    	     }
		    	 }
		     });
		
		btnDois.setBounds(58, 215 , 34, 27);
		btnDois.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnDois.setMargin(new Insets(1,1,1,1));
		paine.add(btnDois);
		btnDois.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("2");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "2");
		    	     }
		    	 }
		     });
		
		btnTres.setBounds(96, 215 , 34, 27);
		btnTres.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnTres.setMargin(new Insets(1,1,1,1));
		paine.add(btnTres);
		btnTres.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("3");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "3");
		    	     }
		    	 }
		     });
		
		btnMenos.setBounds(134, 215 , 34, 27);
		btnMenos.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtvisor.getText());
				sinal = "subtracao";
				txtvisor.setText("0");
			}
		});
		
		
		btnIgual.setBounds(172, 215 , 34, 60);
		btnIgual.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnIgual.setMargin(new Insets(1,1,1,1));
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtvisor.getText());

				if(sinal.equals("soma")) {
					txtvisor.setText(mat.soma(valor1, valor2) + "");
				}
				
				if (sinal.equals("subtracao")) {
					txtvisor.setText(mat.subtracao(valor1, valor2) + "");
			} 
				if (sinal.equals("multiplicacao")) {
				    txtvisor.setText(mat.multiplicacao(valor1, valor2) + "");
				
			}
				if (sinal.equals("divisao")) {
				    txtvisor.setText(mat.divisao(valor1, valor2) + "");
				}
		}});
		
		btnZero.setBounds(20, 248 , 68, 27);
		btnZero.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnZero.setMargin(new Insets(1,1,1,1));
		paine.add(btnZero);
		btnZero.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(txtvisor.getText().equals("0")) {
		    		 txtvisor.setText("0");
		    	 }else {
		    		 txtvisor.setText(txtvisor.getText() + "0");
		    	     }
		    	 }
		     });
		
		btnVirgula.setBounds(96, 248 , 34, 27);
		btnVirgula.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnVirgula.setMargin(new Insets(1,1,1,1));
		paine.add(btnVirgula);
		btnVirgula.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 
		    	 if(!txtvisor.getText().contains(",")) {
		    		 txtvisor.setText(txtvisor.getText()+".");
		    	 }
		    	 }
		     });
	     
		
		btnMais.setBounds(134,248,34,27);
		btnMais.setFont(new Font("Arial" ,Font.PLAIN, 12));
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtvisor.getText());
				sinal = "soma";
				txtvisor.setText("0");
			}
		});
		
		
		
		this.setSize(228,322);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		
		
	}
	public static void main(String [] args) {
		Calculadora calc = new Calculadora();	

	}

}