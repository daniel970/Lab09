package edu.handong.csee.java;

public class Salesman { //Ŭ���� salesman
	private String Name; //�Լ�����
	private double Sales; //�Լ�����
	
	public String getName() { //����� �̸����� ������
		return Name;
	}
	public void setName(String name) { //���� ���� �̸��� �Է°��� this�� �̿��ؼ� ����
		this.Name = name;
	}
	public double getSales() { //����� sales���� ������
		return Sales;
	}
	public void setSales(double sales) { //���� ���� sales�� �Է°��� ����
		this.Sales = sales;
	}
	
}