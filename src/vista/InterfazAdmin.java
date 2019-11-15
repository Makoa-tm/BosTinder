package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;

public class InterfazAdmin extends JFrame {
	private JPanel Contenedor;
	private JPanel Panel;
	private JLabel AdminLogo;
	private JLabel lblMakoaCreditos;
	private JTextField txtEliminar;
	private JLabel lblBuscarUser;
	private JTextField txtBuscar;
	private JButton btnBuscar;
	private JLabel lblTop10;
	private JButton btnPdf;
	private JLabel lblReporteDeAdministrador;
	private JButton button;
	private JButton btnEliminar;
	private JComboBox comboTop10;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	public InterfazAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BosTinder ADMIN");
		setSize(682, 477);
		setResizable(false);

		Contenedor = new JPanel();
		getContentPane().add(Contenedor);
		setLocationRelativeTo(null);
		Contenedor.setLayout(new GridLayout(0, 2, 0, 0));

		Panel = new JPanel();
		Panel.setBackground(new Color(255, 204, 153));
		Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Contenedor.add(Panel);
		Panel.setLayout(null);

		AdminLogo = new JLabel("");
		AdminLogo.setHorizontalAlignment(SwingConstants.CENTER);
		AdminLogo.setIcon(new ImageIcon(InterfazAdmin.class.getResource("/images/logo admin.png")));
		AdminLogo.setBounds(108, 11, 123, 131);
		Panel.add(AdminLogo);

		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		lblAdmin.setBounds(118, 153, 99, 24);
		Panel.add(lblAdmin);

		JLabel lbleliminarUser = new JLabel("\u00BFEliminar un usuario?");
		lbleliminarUser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		lbleliminarUser.setBounds(90, 188, 164, 33);
		Panel.add(lbleliminarUser);

		txtEliminar = new JTextField();
		txtEliminar.setBounds(90, 230, 153, 20);
		Panel.add(txtEliminar);
		txtEliminar.setColumns(10);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEliminar.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnEliminar.setBounds(118, 261, 99, 24);
		Panel.add(btnEliminar);

		lblBuscarUser = new JLabel("\u00BFBuscar un usuario?");
		lblBuscarUser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		lblBuscarUser.setBounds(90, 306, 164, 33);
		Panel.add(lblBuscarUser);

		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(90, 348, 153, 20);
		Panel.add(txtBuscar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBuscar.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnBuscar.setBounds(118, 379, 99, 24);
		Panel.add(btnBuscar);

		JPanel Panel2 = new JPanel();
		Panel2.setBackground(new Color(255, 204, 153));
		Panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Contenedor.add(Panel2);
		Panel2.setLayout(null);

		lblMakoaCreditos = new JLabel("makoa\u00AE");
		lblMakoaCreditos.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblMakoaCreditos.setBounds(286, 412, 42, 25);
		Panel2.add(lblMakoaCreditos);

		lblTop10 = new JLabel("Top 10:");
		lblTop10.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblTop10.setBounds(47, 120, 78, 33);
		Panel2.add(lblTop10);

		comboTop10 = new JComboBox();
		comboTop10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboTop10.setModel(new DefaultComboBoxModel(new String[] { "Likes", "Ingresos", "Genero" }));
		comboTop10.setFont(new Font("Verdana", Font.BOLD, 11));
		comboTop10.setBounds(137, 125, 111, 25);
		Panel2.add(comboTop10);

		JLabel lblPromedios = new JLabel("Promedios:");
		lblPromedios.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblPromedios.setBounds(47, 239, 90, 33);
		Panel2.add(lblPromedios);

		comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Media", "Moda", "Mediana" }));
		comboBox.setBounds(137, 245, 111, 25);
		Panel2.add(comboBox);

		JLabel lblUsuarios = new JLabel("Usuarios:");
		lblUsuarios.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblUsuarios.setBounds(47, 301, 78, 33);
		Panel2.add(lblUsuarios);

		comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1
				.setModel(new DefaultComboBoxModel(new String[] { "Edad", "Likes", "Apellido", "Nombre", "Usuario" }));
		comboBox_1.setFont(new Font("Verdana", Font.BOLD, 11));
		comboBox_1.setBounds(137, 307, 111, 25);
		Panel2.add(comboBox_1);

		btnPdf = new JButton("PDF");
		btnPdf.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPdf.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnPdf.setBounds(137, 176, 99, 24);
		Panel2.add(btnPdf);

		lblReporteDeAdministrador = new JLabel("Reporte de administrador");
		lblReporteDeAdministrador.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		lblReporteDeAdministrador.setBounds(75, 34, 193, 33);
		Panel2.add(lblReporteDeAdministrador);

		button = new JButton("PDF");
		button.setFont(new Font("Georgia", Font.PLAIN, 12));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBounds(137, 356, 99, 24);
		Panel2.add(button);
		setVisible(true);

	}

	public static void main(String[] args) {
		InterfazAdmin iAdmin = new InterfazAdmin();
	}
}
