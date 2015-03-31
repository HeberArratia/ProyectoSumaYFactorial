package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import Servicio.SumaYFactorialServicioProxy;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;

public class VistaVentana extends JFrame {
	SumaYFactorialServicioProxy obj = new SumaYFactorialServicioProxy();
	private JPanel contentPane;
	private JTextField valora;
	private JTextField valorb;
	private JTextField valorc;
	private JLabel resultadofac;
	private JButton btncalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaVentana frame = new VistaVentana();
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
	public VistaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		valora = new JTextField();
		valora.setBounds(38, 48, 54, 20);
		contentPane.add(valora);
		valora.setColumns(10);
		
		valorb = new JTextField();
		valorb.setBounds(117, 48, 54, 20);
		contentPane.add(valorb);
		valorb.setColumns(10);
		
		JLabel label = new JLabel("+");
		label.setFont(new Font("Calibri", Font.BOLD, 19));
		label.setBounds(102, 44, 18, 26);
		contentPane.add(label);
		
		JLabel sumaresultado = new JLabel("=");
		sumaresultado.setFont(new Font("Calibri", Font.BOLD, 18));
		sumaresultado.setBounds(181, 51, 46, 14);
		contentPane.add(sumaresultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			// Boton sumar
			public void actionPerformed(ActionEvent arg0) {
				// Guardamos los valores ingresados por el usario en variables
				int a = Integer.parseInt(valora.getText());
				int b = Integer.parseInt(valorb.getText());		
				try {
				// Imprimimos en pantalla la funcion que retorna la suma de los valores	
					sumaresultado.setText("= "+obj.sumaNumeros(a,b));
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSumar.setBounds(64, 79, 89, 23);
		contentPane.add(btnSumar);
		
		valorc = new JTextField();
		valorc.setBounds(38, 125, 54, 20);
		contentPane.add(valorc);
		valorc.setColumns(10);
		
		resultadofac = new JLabel("=");
		resultadofac.setFont(new Font("Calibri", Font.BOLD, 18));
		resultadofac.setBounds(102, 128, 125, 14);
		contentPane.add(resultadofac);
		
		btncalcular = new JButton("Calcular Factorial");
		btncalcular.addActionListener(new ActionListener() {
			// Boton Calcular Factorial
			public void actionPerformed(ActionEvent e) {				
				// Guardamos en una variable el valor ingresado por el usuario
				int c = Integer.parseInt(valorc.getText());
				try {
					// Mostramos en pantalla el valor que retorna la funcion factorial
					resultadofac.setText("= "+obj.factorial(c));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btncalcular.setBounds(56, 156, 115, 23);
		contentPane.add(btncalcular);
	}
}
