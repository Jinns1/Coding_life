package github;
import java.util.*;
public class ex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] a = new int [2][3];
		
		for(int i =0; i<a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.print("숫자 입력해주세요 :");
				a[i][j] = sc.nextInt();
			}
		}
	
				System.out.print(a[0]);
		
		
		
	}//main

}//class
