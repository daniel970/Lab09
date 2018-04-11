package edu.handong.csee.java;

import java.util.Scanner;

/**������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/10
 * ����: �� ���α׷��� salesman�� ��, salesdata�� �Է¹޾� ������� ������ִ� �Լ��Դϴ�.
 */

public class salesReport { //salesReport Ŭ����
	private double highSales; //double���� highSales�� ����
	private double averageSales; //double���� averageSales�� ����
	private Salesman[] team; //�迭 team�� ����
	
	public static void main (String[] args) {
			salesReport analyzer = new salesReport(); //analyzer��� ������ salesReport��� Ŭ������ �ν��Ͻ�ȭ
			
			analyzer.getData(); //getdata �޼ҵ带 ����
			analyzer.computeAverage(); //computeAverage �޼ҵ带 ����
			analyzer.computeHighestSales(); //computeHighestSales �޼ҵ带 ����
			analyzer.printResults(); //printResult �޼ҵ带 ����
	} 
	
	public void getData() { //getData �޼ҵ�
		System.out.println("enter the number of salesman: ");
		Scanner input = new Scanner(System.in); //��ĳ�� input �� ����
		
		int numOfSalesman = input.nextInt(); //numOfSalesman��� ������ �Է°��� ����
		
		team = new Salesman[numOfSalesman]; //team�̶�� �迭�Լ��� ũ�⸦  �Է°���ŭ ����
		
		for(int i=0; i <team.length; i++) { //team�̶�� �迭�Լ��� ���̸�ŭ for������ �ݺ�
			System.out.println("enter data for associate number " + (i+1)); //�޼��� ���
			System.out.println("Name? "); //�̸��� ������� �޼����� ���
			String name = input.nextLine(); //name �̶�� ������ ���� �Է°��� ����
			System.out.print("sales? "); //�޼��� ���
			double sales = input.nextDouble(); //sales �̶�� ������ ���� �Է°��� ����
			team[i] = new Salesman(); //������ ��ü�� ����
			team[i].setName(name); //�̸����� ��ü�� ����
			team[i].setSales(sales);  //sales���� ��ü�� ����
			
		}
	}
	
	public void computeAverage() { //����� ���ϴ� �޼ҵ�
		double sum =0; //sum �Լ��� �ʱ�ȭ
		for(int i=0; i <team.length;i++) { //team�迭�� ���̸�ŭ for������ ����
			sum = sum + team[i].getSales(); //sum�Լ��� ��� sales���� ���Ѵ�
			
		}
		this.averageSales = sum/team.length; //averageSales�� ��հ��� ����
	}
	
	public void computeHighestSales() { //���� ���� sales�� �˾Ƴ��� �޼ҵ�
		double highestSales =0; //0���� �ʱ�ȭ
		for(int i=0; i<team.length;i++) { //team�迭�� ���̸�ŭ for������ ����
			if(highestSales < team[i].getSales()) //highestSales���� ���� ������
				highestSales = team[i].getSales(); //�� ������ ��ü
		}
		this.highSales=highestSales; //���� �������ڸ� highestSales�� ����
	}
	
	public void printResults() { //����� ����ϴ� �Լ�
		System.out.println("Average: " + averageSales); //��հ��� ���
		System.out.println("salesman who has the highest sales: "); //���� ���� sales�� ���� ����� ����ϱ� ���� �� ����
		
		for (int i=0;i < team.length; i++) {//team�迭�� ���̸�ŭ for������ ����
			if(team[i].getSales() == this.highSales) { //team�迭���� ������ sales�� ���� ���� sales�� ������
				System.out.println("name: " + team[i].getName()); //�� sales�� ���� �̸��� ���
				System.out.println("Sales: " + team[i].getSales()); //�� sales���� ���
			}
		}
	}
	
}

