package edu.handong.csee.java;
/**
 * 
 * @author doyou
 *
 */
public class Salesman { //class salesman
	private String Name; //declare String Name
	private double Sales; //declare double Sales
	
	public String getName() { //send Name value
		return Name;
	}
	public void setName(String name) { //save new name value
		this.Name = name;
	}
	public double getSales() { //send Sales value
		return Sales;
	}
	public void setSales(double sales) { //save new Sales value
		this.Sales = sales;
	}
	
}