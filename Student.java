//�ǽ� ����
//5�� �л��� 5�� ���� ������ Ű����� �Է¹޾� o
//0~100���������� üũ�ϰ�  o
//�� �л��� ����,���, �� ������ ����� ��� ��� o
//�߰��� �ְ� ���� ����л�, ���� �ְ� �����ڸ� ã�� ����ϴ� ���α׷�
package github;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String student[]= {"��","��","��","��","��"};
		String subject[]= {"����","����","����","����","ü��"};
		int[][] student_score = new int[5][5]; // 5�� 5�� �л��� ���� ����
		
		int student_sum[] = new int[5];        // �л� �������� ���� �ջ� ����
		double student_avg[] = new double[5];  // �л� �������� ���� ��� ����
		
		int subject_sum[] = new int[5];        // ���� �� ���� �ջ� ����
		double subject_avg[] = new double[5];  // ���� �� ���� ��� ����
		
		int b_student=0;      				   // �ְ� ���� �л� ����
		int a =0;

		int b_s_subject[]= new int[5]; // ���� �ְ� ������ ����
	
	    //�л� ���� �Է�
		for(int i=0;i<student_score.length;i++) {
			for(int j=0;j<student_score[i].length;j++) {
				System.out.print(student[i]+" �л��� "+ subject[j]+"������ �Է����ּ��� :");
				student_score[i][j] = sc.nextInt();
				
				if(student_score[i][j] < 0 || student_score[i][j]>100) {
					System.out.println("�߸��� �Է��Դϴ�.");
						--j;
				}//if
				
			}//for j
			System.out.println("----------------------------");
		}//for i
		
		//�л��� ����
		for(int i=0; i<student_score.length; i++) {
			for(int j=0;j<student_score[i].length;j++) {
			student_sum[i]+= student_score[i][j];
			}//for i
		}//for j	
		for(int i=0; i<student_score.length; i++) {
		System.out.println(student[i]+"�� ���� : "+student_sum[i]);
		}//for i
		
		System.out.println("----------------------------"); // �� ������
		
		//�л��� ���
		for(int i=0; i<student_score.length; i++) {
			student_avg[i] = student_sum[i]/5;
			System.out.println(student[i]+"�� ��� : " + student_avg[i]);
		}
		
		System.out.println("----------------------------"); // �� ������

		//������ ����
		for(int i =0; i < student_score.length; i++) {
			for(int j=0;j<student_score[i].length;j++) {
			subject_sum[i] += student_score[j][i];		
			}
		}
		// ������ ���
		for(int i=0; i<student_score.length; i++) {
			subject_avg[i] = subject_sum[i]/5;
			System.out.println(subject[i]+"�� ��� : " + subject_avg[i]);
		}
		
		System.out.println("----------------------------"); // �� ������
		
		b_student = student_sum[0];
		b_s_subject[0]= student_score[0][0];
		for(int i=0;i<student_sum.length; i++) {
			if(b_student < student_sum[i]) {
				b_student = student_sum[i];
				a = i;
			}
		}
		System.out.println("������ ����� �л��� " + student[a] + ", ������" + b_student + "�̴�");
		
		System.out.println("----------------------------"); // �� ������
		
		for(int i=0; i < student_score.length; i++) {
			for(int j =0; j< student_score[i].length;j++) {
				if(b_s_subject[i] < student_score[j][i]) {
					b_s_subject[i] = student_score[j][i];
					a = j;
				}
			}
			System.out.println(subject[i]+" ���� �ְ� ������ �л��� " + student[a] + " �̰� ������ " + b_s_subject[i] + "�̴�");
		}
	}//main
}//class
