package edu.handong.csee.java;

import java.util.ArrayList;
import java.util.Scanner;

/**제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/10
 * 설명: 이 프로그램은 salesman의 수, salesdata를 입력받아 결과값을 출력해주는 함수입니다.
 */

public class salesReport { //salesReport class
	private double highSales; //make highSales double variable
	private double averageSales; //make averageSales double variable
	ArrayList<Salesman> salesmanList = new ArrayList<Salesman>(); //make salesmanList ArrayList
	
	public static void main (String[] args) { //main
			salesReport analyzer = new salesReport(); //make analyzer which will instantiate salesReport
			
			analyzer.getData(); //run getData
			analyzer.computeAverage(); //run computeAverage
			analyzer.computeHighestSales(); //run computeHighestSales
			analyzer.printResults(); //run printResult
	} 
	
	public void getData() { //getData method

		Scanner input = new Scanner(System.in); //make input scanner
		boolean done = false; //make done which will ask if i will end or not
		
		while (!done) { //repeats infinitely until i say no
			Salesman team = new Salesman(); //make team which will instantiate Salesman
			System.out.println("Enter name: "); //show sentence which will ask for name
			String name = input.nextLine(); //save user input on String name
			System.out.println("Enter Sales: "); //show sentence which will ask for sales
			double sales = input.nextDouble(); //save user input on double sales
			team.setName(name); //save name value on team
			team.setSales(sales); //save sales value on team
			salesmanList.add(team); //add team on salesmanList ArrayList
			
			System.out.print("More people? "); //show sentence which will ask if i will end
			String ans = input.nextLine(); //save user input on String ans
			if (!ans.equalsIgnoreCase ("yes")) { //if i don't get user input "yes"
				done = true; //change done to true and end while
			}
		}
		input.close(); //close scanner input
	}	

	public void computeAverage() { //method which will compute average
		double sum =0; //reset sum value to 0
		for(int i=0; i <salesmanList.size();i++) { //make for construction which will repeat in salesmanList size amount
			sum = sum + (salesmanList.get(i)).getSales(); //add all sales on sum value
		}
		this.averageSales = sum/salesmanList.size(); //divide sum with number of salesman and save averageSales
	}
	
	public void computeHighestSales() { //method which will figure out highest sales
		double highestSales =0; //reset highSales 0
		for(int i=0; i<salesmanList.size();i++) { //make for construction which will repeat in salesmanList size amount
			if(highestSales < (salesmanList.get(i)).getSales()) //if sales is higher than highestSales
				highestSales = (salesmanList.get(i)).getSales(); //change to higher value
		}
		this.highSales=highestSales; //save highest sales on highSales
	}
	
	public void printResults() { //method which will print results
		System.out.println("Average: " + averageSales); //print average of sales
		System.out.println("salesman who has the highest sales: "); //display message
		
		for (int i=0;i < salesmanList.size(); i++) {//make for construction which will repeat in salesmanList size amount
			if(salesmanList.get(i).getSales() == this.highSales) { //if sales value in salesmanList is same with the amount of highest sales
				System.out.println("name: " + (salesmanList.get(i)).getName()); //print the name of person who has highest sales
				System.out.println("Sales: " + (salesmanList.get(i)).getSales()); //print the highest sales value
			}
		}
	}
}

