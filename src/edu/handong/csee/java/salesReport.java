package edu.handong.csee.java;

import java.util.Scanner;

public class salesReport {
	private double highSales;
	private double averageSales;
	private Salesman[] team;
	
	public static void main (String[] args) {
			salesReport analyzer = new salesReport();
			
			analyzer.getData();
			analyzer.computeAverage();
			analyzer.computeHighestSales();
			analyzer.printResults();
	}
	
	public void getData() {
		System.out.println("enter the number of salesman: ");
		Scanner input = new Scanner(System.in);
		
		int numOfSalesman = input.nextInt();
		
		team = new Salesman[numOfSalesman];
		
		for(int i=0; i <team.length; i++) {
			System.out.println("enter data for associate number" + (i+1));
			System.out.println("Name? ");input.nextLine();
			String name = input.nextLine();
			System.out.print("sales? ");
			double sales = input.nextDouble();
			team[i] = new Salesman();
			team[i].setName(name);
			team[i].setSales(sales); 
			
		}
	}
	
	public void computeAverage() {
		double sum =0;
		for(int i=0; i <team.length;i++) {
			sum = sum + team[i].getSales();
			
		}
		this.averageSales = sum/team.length;
	}
	
	public void computeHighestSales() {
		double highestSales =0;
		for(int i=0; i<team.length;i++) {
			if(highestSales < team[i].getSales())
				highestSales = team[i].getSales();
		}
		this.highSales=highestSales;
	}
	
	public void printResults() {
		System.out.println("Average: " + averageSales);
		System.out.println("salesman who has the highest sales: ");
		
		for (int i=0;i < team.length; i++) {
			if(team[i].getSales() == this.highSales) {
				System.out.println("name: " + team[i].getName());
				System.out.println("Sales: " + team[i].getSales());
			}
		}
	}
	
}
