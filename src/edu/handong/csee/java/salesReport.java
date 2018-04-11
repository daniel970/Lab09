package edu.handong.csee.java;

import java.util.Scanner;

/**제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/10
 * 설명: 이 프로그램은 salesman의 수, salesdata를 입력받아 결과값을 출력해주는 함수입니다.
 */

public class salesReport { //salesReport 클래스
	private double highSales; //double변수 highSales를 생성
	private double averageSales; //double변수 averageSales를 생성
	private Salesman[] team; //배열 team을 생성
	
	public static void main (String[] args) {
			salesReport analyzer = new salesReport(); //analyzer라는 변수에 salesReport라는 클래스를 인스턴스화
			
			analyzer.getData(); //getdata 메소드를 실행
			analyzer.computeAverage(); //computeAverage 메소드를 실행
			analyzer.computeHighestSales(); //computeHighestSales 메소드를 실행
			analyzer.printResults(); //printResult 메소드를 실행
	} 
	
	public void getData() { //getData 메소드
		System.out.println("enter the number of salesman: ");
		Scanner input = new Scanner(System.in); //스캐너 input 을 생성
		
		int numOfSalesman = input.nextInt(); //numOfSalesman라는 변수에 입력값을 저장
		
		team = new Salesman[numOfSalesman]; //team이라는 배열함수의 크기를  입력값만큼 지정
		
		for(int i=0; i <team.length; i++) { //team이라는 배열함수의 길이만큼 for구문을 반복
			System.out.println("enter data for associate number " + (i+1)); //메세지 출력
			System.out.println("Name? "); //이름을 적으라는 메세지를 출력
			String name = input.nextLine(); //name 이라는 변수를 만들어서 입력값을 저장
			System.out.print("sales? "); //메세지 출력
			double sales = input.nextDouble(); //sales 이라는 변수를 만들어서 입력값을 저장
			team[i] = new Salesman(); //저장할 객체를 생성
			team[i].setName(name); //이름값을 객체에 저장
			team[i].setSales(sales);  //sales값을 객체에 저장
			
		}
	}
	
	public void computeAverage() { //평균을 구하는 메소드
		double sum =0; //sum 함수를 초기화
		for(int i=0; i <team.length;i++) { //team배열의 길이만큼 for구문을 생성
			sum = sum + team[i].getSales(); //sum함수에 모든 sales값을 더한다
			
		}
		this.averageSales = sum/team.length; //averageSales에 평균값을 저장
	}
	
	public void computeHighestSales() { //가장 높은 sales를 알아내는 메소드
		double highestSales =0; //0으로 초기화
		for(int i=0; i<team.length;i++) { //team배열의 길이만큼 for구문을 생성
			if(highestSales < team[i].getSales()) //highestSales보다 값이 높으면
				highestSales = team[i].getSales(); //그 값으로 대체
		}
		this.highSales=highestSales; //가장 높은숫자를 highestSales에 저장
	}
	
	public void printResults() { //결과를 출력하는 함수
		System.out.println("Average: " + averageSales); //평균값을 출력
		System.out.println("salesman who has the highest sales: "); //가장 높은 sales를 가진 사람을 출력하기 위한 전 구문
		
		for (int i=0;i < team.length; i++) {//team배열의 길이만큼 for구문을 생성
			if(team[i].getSales() == this.highSales) { //team배열에서 가져온 sales가 가장 높은 sales와 같으면
				System.out.println("name: " + team[i].getName()); //그 sales를 가진 이름을 출력
				System.out.println("Sales: " + team[i].getSales()); //그 sales값을 출력
			}
		}
	}
	
}

