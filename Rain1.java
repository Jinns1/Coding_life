package eclipse6;

import java.util.*;
public class Rain1{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int month[] = {1,2,3,4,5,6,7,8,9,10,11,12}; //월
	int year[] = {2012,2013,2014,2015,2016,2017,2018,2019,2020,2021}; //년도
	int[][] rain = new int[year.length][month.length]; //강우량 입력
	
	int year_r[] = new int[year.length]; //년도별 강우량 총합
	int month_r[] = new int[month.length]; //월별 강우량 총합
	
	int year_sum =0;
	
	double year_avg = 0.0;
	double month_avg[] = new double[month.length];
	
	for(int i =0; i<rain.length;i++) {
		for(int j =0; j<rain[i].length; j++) {
			System.out.print(year[i] + "년 " + month[j] + "월의 강우량을 입력하세요 : ");
			rain[i][j] = sc.nextInt();
			if(rain[i][j] < 0 || rain[i][j]>1500) {
				System.out.println("0~1500사이의 값으로 다시 입력하세요.");
					--j;
			}//if
			
			year_r[i]+= rain[i][j];	
		}
		year_sum += year_r[i];
		year_avg = (year_sum) / year.length;
	}
	
	System.out.println("---------------------------------------"); // 줄바꿈

	//년도 월별 총 강우량
	for(int i=0; i<rain.length; i++) {
		System.out.println("----" + year[i] + "년도 강우량----");
		for(int j=0;j<rain[i].length;j++) {
			System.out.println(month[j]+"월 :" + rain[i][j]);
		}//for i
	}//for j	
	


	for(int i=0;i<month.length;i++) {
		for(int j=0;j<year.length;j++) {
			month_r[i]+=rain[j][i];
		}
		month_avg[i] += month_r[i] / year.length;
	}
	
	System.out.println("---------------------------------------"); // 줄바꿈

	
	for(int i=0; i<year.length; i++) {
		System.out.println(year[i]+"년의 총 강우량 : " + year_r[i]);
	}
	
	System.out.println("----지난 10년간 월별 강우량 평균----");
	for(int i=0; i<month.length; i++) {
		System.out.println(month[i]+"월별 총 평균 강우량 : " + month_avg[i]);
	}
	
	System.out.println("---------------------------------------"); // 줄바꿈
	
	System.out.println("지난 10년간 평균 강우량 : " + year_avg );

	}//main
}//clss