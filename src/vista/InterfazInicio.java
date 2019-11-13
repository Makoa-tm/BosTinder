package vista;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Controlador;

public class InterfazInicio extends JFrame {
	private JLabel fondo;

	public InterfazInicio(Controlador control) {
		setSize(420, 383);
		setResizable(true);
		setTitle("BosTinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 470, 407);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setSize(new Dimension(20, 30));
		lblNewLabel.setPreferredSize(new Dimension(15, 14));
		lblNewLabel.setIcon(new ImageIcon("D:\\Local files\\java-2018-12\\eclipse\\Workspace\\BosTinder\\src\\images\\Icon image 3.png"));
		lblNewLabel.setBounds(-27, -33, 524, 474);
		panel.add(lblNewLabel);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/images/Blue Background_2.jpg")));
		fondo.setBounds(0, -27, 420, 405);
		panel.add(fondo);

		

	}
}
