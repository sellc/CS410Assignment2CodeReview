package adapters;

import java.awt.Color;

import sensor.PressureSensor;

//Chris Sellers
//5/28/2019
//CS 410
//Assignment 2

public class PressureAdapter implements Adapter {

	private PressureSensor adaptee;
	private double pressure;

	//Constructor
	public PressureAdapter(PressureSensor adaptee) {
		this.adaptee = adaptee;
		pressure = adaptee.readValue();
	}

	@Override
	public String getName() {
		return adaptee.getSensorName();
	}

	@Override
	public double getValue() {
		return pressure;
	}

	@Override
	public String getReport() {
		if (pressure > 6.58) {
			return "DANGER";
		}
		if (pressure >= 5) {
			return "CRITICAL";
		}
		return "OK";
	}

	@Override
	public Color getColor() {
		if (pressure > 6.58) {
			return Color.red;
		}
		if (pressure >= 5) {
			return Color.yellow;
		}
		return Color.green;
	}

}
