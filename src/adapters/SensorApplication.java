package adapters;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import sensor.PressureSensor;
import sensor.RadiationSensor;
import sensor.TemperatureSensor;

//Chris Sellers
//5/28/2019
//CS 410
//Assignment 2

public class SensorApplication extends JFrame {
	
	public SensorApplication() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));
		
		//->
		TemperatureAdapter ta = new TemperatureAdapter(new TemperatureSensor());
		JPanel temperaturePanel = new JPanel();
		JPanel tempStatus = new JPanel();
		JLabel tempValue = new JLabel(ta.getReport() + " " + String.valueOf(ta.getValue()));
		temperaturePanel.setLayout(null);
		temperaturePanel.setBorder(new TitledBorder(ta.getName()));
		tempStatus.setBounds(20, 20, (int) (ta.getValue()), 50);
		tempStatus.setBackground(ta.getColor());
		tempValue.setBounds(100, 80, 100, 30);
		temperaturePanel.add(tempStatus);
		temperaturePanel.add(tempValue);
		add(temperaturePanel);
		
		RadiationAdapter ra = new RadiationAdapter(new RadiationSensor());
		JPanel radiationPanel = new JPanel();
		JPanel radiationStatus = new JPanel();
		JLabel radiationValue = new JLabel(ra.getReport() + " " + String.valueOf(ra.getValue()));
		radiationPanel.setLayout(null);
		radiationPanel.setBorder(new TitledBorder(ra.getName()));
		radiationStatus.setBounds(20, 20, (int) ((ra.getValue() + 1) * 25), 50);
		radiationStatus.setBackground(ra.getColor());
		radiationValue.setBounds(100, 80, 100, 30);
		radiationPanel.add(radiationStatus);
		radiationPanel.add(radiationValue);
		add(radiationPanel);

		PressureAdapter pa = new PressureAdapter(new PressureSensor());
		JPanel pressurePanel = new JPanel();
		JPanel pressureStatus = new JPanel();
		JLabel pressureValue = new JLabel(pa.getReport() + " " + String.valueOf(pa.getValue()));
		pressurePanel.setLayout(null);
		pressurePanel.setBorder(new TitledBorder(pa.getName()));
		pressureStatus.setBounds(20, 20, (int)((pa.getValue() + 1) * 25), 50);
		pressureStatus.setBackground(pa.getColor());
		pressureValue.setBounds(100, 80, 100, 30);
		pressurePanel.add(pressureStatus);
		pressurePanel.add(pressureValue);
		add(pressurePanel);
		//->
		
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
	}

}
