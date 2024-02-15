
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNif;
	private JTextField txtTarjeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Alta de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 177);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE CLIENTE:");
		lblNombre.setBounds(26, 24, 127, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(26, 49, 46, 14);
		contentPane.add(lblNif);
		
		JLabel lblTarjetaCrdito = new JLabel("TARJETA CRÉDITO:");
		lblTarjetaCrdito.setBounds(26, 74, 102, 14);
		contentPane.add(lblTarjetaCrdito);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(184, 21, 111, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNif = new JTextField();
		txtNif.setColumns(10);
		txtNif.setBounds(184, 46, 111, 20);
		contentPane.add(txtNif);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setColumns(10);
		txtTarjeta.setBounds(184, 74, 111, 20);
		contentPane.add(txtTarjeta);
		
		JButton btnDarAlta = new JButton("Dar de alta");
		
		btnDarAlta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileWriter fichero;
				
				String nuevoCliente=txtNombre.getText()+"-"+
					    txtNif.getText()+"-"+txtTarjeta.getText()+"\n";
				
				verMensaje("Hola Pepe.Voy insertar:\n"+txtNombre.getText()+"\n"+
						    txtNif.getText()+"\n"+txtTarjeta.getText());
				
				/**try {
					fichero=new FileWriter("clientes.vda",true);
					fichero.write(nuevoCliente);
					fichero.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					verMensaje("El fichero no puede abrirse o guardarse");
				}
				
				
				verMensaje("Datos de cliente guardados!!!");
				
				txtNombre.setText("");
				txtNif.setText("");
				txtTarjeta.setText("");**/
			}
		});
		btnDarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDarAlta.setBounds(184, 105, 111, 23);
		contentPane.add(btnDarAlta);
	}
	
	private void verMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}