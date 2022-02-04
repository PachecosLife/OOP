package curso.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
		public class TimeThread extends JDialog {
			
			private JPanel jPanel = new JPanel(new GridBagLayout());
			
			private JLabel descricaoHora = new JLabel("NOME");
			private JTextField mostraTempo = new JTextField();
			private JLabel descricaoHora2 = new JLabel("E-MAIL");
			private JTextField mostraTempo2 = new JTextField();
			private JButton jButton = new JButton("ADD LISTA");
			private JButton jButton2 = new JButton("STOP");
			
		
			public TimeThread() {
				//CONFIGURAÇÕES INICIAIS 
				setTitle("==== OLÁ MUNDO ====="); //TÍTULO DA ABA
				setSize(new Dimension(350, 350)); //TAMANHO DA JANELA LARGURA/ALTURA
				setLocationRelativeTo(null);
				setResizable(false); // SE É POSSÍVEL AUMENTAR OU DIMINUIR 
				
				GridBagConstraints gridBagConstraints = new GridBagConstraints();
				gridBagConstraints.gridx = 0;            //gridX = SIGNIFICA LINHA 
				gridBagConstraints.gridy = 0;			//gridY = SIGNIFICA COLUNA 
				gridBagConstraints.gridwidth = 2;
				gridBagConstraints.insets = new Insets(5, 10, 5, 5);
				
				descricaoHora.setPreferredSize(new Dimension(200, 25));
				jPanel.add(descricaoHora, gridBagConstraints);
				//NÃO PRECISOU DO GRIDBAG PORQUE JÁ COMEÇA NO PADRÃO CITADO ACIMA 0/0
				
				mostraTempo.setPreferredSize(new Dimension(200, 25));
				gridBagConstraints.gridy++; 
				jPanel.add(mostraTempo, gridBagConstraints);
				
				descricaoHora2.setPreferredSize(new Dimension(200, 25));
				gridBagConstraints.gridy++;
				jPanel.add(descricaoHora2, gridBagConstraints);
				
				mostraTempo2.setPreferredSize(new Dimension(200, 25));
				gridBagConstraints.gridy++;
				jPanel.add(mostraTempo2, gridBagConstraints);
				
				gridBagConstraints.gridwidth = 1;
				
				jButton.setPreferredSize(new Dimension(90, 25));
				gridBagConstraints.gridy++;
				jPanel.add(jButton, gridBagConstraints);
				
				jButton2.setPreferredSize(new Dimension(92, 25));
				gridBagConstraints.gridx++;
				jPanel.add(jButton2, gridBagConstraints);
				
				jButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						
					}
				});
				
				jButton2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
							
					}
				});
				
				
				
				add(jPanel, BorderLayout.WEST);
				setVisible(true); //SEMPRE FICAR POR ÚLTIMO.
			}

}
