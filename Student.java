//실습 문제
//5명 학생의 5개 과목 성적을 키보드로 입력받아 o
//0~100점사이인지 체크하고  o
//각 학생의 총점,평균, 각 과목의 평균을 계산 출력 o
//추가로 최고 성적 우수학생, 과목별 최고 득점자를 찾아 출력하는 프로그램
package github;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String student[]= {"가","나","다","라","마"};
		String subject[]= {"국어","영어","수학","과학","체육"};
		int[][] student_score = new int[5][5]; // 5행 5열 학생의 점수 저장
		
		int student_sum[] = new int[5];        // 학생 개개인의 점수 합산 저장
		double student_avg[] = new double[5];  // 학생 개개인의 점수 평균 저장
		
		int subject_sum[] = new int[5];        // 과목 별 점수 합산 저장
		double subject_avg[] = new double[5];  // 과목 별 점수 평균 저장
		
		int b_student=0;      				   // 최고 성적 학생 저장
		int a =0;

		int b_s_subject[]= new int[5]; // 과목별 최고 득점자 저장
	
	    //학생 성적 입력
		for(int i=0;i<student_score.length;i++) {
			for(int j=0;j<student_score[i].length;j++) {
				System.out.print(student[i]+" 학생의 "+ subject[j]+"성적을 입력해주세요 :");
				student_score[i][j] = sc.nextInt();
				
				if(student_score[i][j] < 0 || student_score[i][j]>100) {
					System.out.println("잘못된 입력입니다.");
						--j;
				}//if
				
			}//for j
			System.out.println("----------------------------");
		}//for i
		
		//학생의 총점
		for(int i=0; i<student_score.length; i++) {
			for(int j=0;j<student_score[i].length;j++) {
			student_sum[i]+= student_score[i][j];
			}//for i
		}//for j	
		for(int i=0; i<student_score.length; i++) {
		System.out.println(student[i]+"의 총점 : "+student_sum[i]);
		}//for i
		
		System.out.println("----------------------------"); // 줄 나누기
		
		//학생의 평균
		for(int i=0; i<student_score.length; i++) {
			student_avg[i] = student_sum[i]/5;
			System.out.println(student[i]+"의 평균 : " + student_avg[i]);
		}
		
		System.out.println("----------------------------"); // 줄 나누기

		//과목의 총점
		for(int i =0; i < student_score.length; i++) {
			for(int j=0;j<student_score[i].length;j++) {
			subject_sum[i] += student_score[j][i];		
			}
		}
		// 과목의 평균
		for(int i=0; i<student_score.length; i++) {
			subject_avg[i] = subject_sum[i]/5;
			System.out.println(subject[i]+"의 평균 : " + subject_avg[i]);
		}
		
		System.out.println("----------------------------"); // 줄 나누기
		
		b_student = student_sum[0];
		b_s_subject[0]= student_score[0][0];
		for(int i=0;i<student_sum.length; i++) {
			if(b_student < student_sum[i]) {
				b_student = student_sum[i];
				a = i;
			}
		}
		System.out.println("성적이 우수한 학생은 " + student[a] + ", 점수는" + b_student + "이다");
		
		System.out.println("----------------------------"); // 줄 나누기
		
		for(int i=0; i < student_score.length; i++) {
			for(int j =0; j< student_score[i].length;j++) {
				if(b_s_subject[i] < student_score[j][i]) {
					b_s_subject[i] = student_score[j][i];
					a = j;
				}
			}
			System.out.println(subject[i]+" 과목 최고 성적인 학생은 " + student[a] + " 이고 점수는 " + b_s_subject[i] + "이다");
		}
	}//main
}//class
