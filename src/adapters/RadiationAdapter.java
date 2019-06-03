package adapters;

import java.awt.Color;

import sensor.RadiationSensor;

//Chris Sellers
//5/28/2019
//CS 410
//Assignment 2

public class RadiationAdapter implements Adapter {

	private RadiationSensor adaptee;
	private double level;

	//Constructor
	public RadiationAdapter(RadiationSensor adaptee) {
		this.adaptee = adaptee;
		level = adaptee.getRadiationValue();
	}

	@Override
	public String getName() {
		return adaptee.getName();
	}

	@Override
	public double getValue() {
		return level;
	}

	@Override
	public String getReport() {
		if (level > 4) {
			return "DANGER";
		}
		if (level >= 3) {
			return "CRITICAL";
		}
		return "OK";
	}

	@Override
	public Color getColor() {
		if (level > 4) {
			return Color.red;
		}
		if (level >= 3) {
			return Color.yellow;
		}
		return Color.green;
	}

}
