package adapters;

import java.awt.Color;

import sensor.TemperatureSensor;

//Chris Sellers
//5/28/2019
//CS 410
//Assignment 2

public class TemperatureAdapter implements Adapter {

	private TemperatureSensor adaptee;
	private double temp;

	//Constructor
	public TemperatureAdapter(TemperatureSensor adaptee) {
		this.adaptee = adaptee;
		temp = adaptee.senseTemperature();
	}

	@Override
	public String getName() {
		return adaptee.getSensorType();
	}

	@Override
	public double getValue() {
		return temp;
	}

	@Override
	public String getReport() {
		if (temp > 300) {
			return "DANGER";
		}
		if (temp >= 235) {
			return "CRITICAL";
		}
		return "OK";
	}

	@Override
	public Color getColor() {
		if (temp > 300) {
			return Color.red;
		}
		if (temp >= 235) {
			return Color.yellow;
		}
		return Color.green;
	}

}
