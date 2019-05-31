package adapters;

import java.awt.Color;

//Chris Sellers
//5/28/2019
//CS 410
//Assignment 2

//Interface used by all adapter classes
public interface Adapter {
	
	//Get name of sensor
	public String getName();
	
	//Get value from sensor
	public double getValue();
	
	//Get report from sensor
	public String getReport();
	
	//Get correct color based on value
	public Color getColor();
}
