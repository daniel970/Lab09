package edu.handong.csee.java;
/**
 * 
 * @author doyou
 *
 */
public class Salesman { //클래스 salesman
	private String Name; //함수선언
	private double Sales; //함수선언
	
	public String getName() { //저장된 이름값을 보낸다
		return Name;
	}
	public void setName(String name) { //새로 들어온 이름의 입력값을 this를 이용해서 저장
		this.Name = name;
	}
	public double getSales() { //저장된 sales값을 보낸다
		return Sales;
	}
	public void setSales(double sales) { //새로 들어온 sales의 입력값을 저장
		this.Sales = sales;
	}
	
}