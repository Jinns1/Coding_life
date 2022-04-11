package github;
import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		final int SIZE = 100;
		int[] numbers = new int[SIZE];
		
		for(int i=0; i < SIZE; i++) {
			int r =(int) (Math.random() * 100); //난수 발생
			numbers[i] = r;
		}
		System.out.print("최초의 리스트 : ");
			for(int r : numbers) {
				System.out.print(r +" ");
			}
		Arrays.sort(numbers); //정렬해주기
		
		System.out.print("\n정렬된 리스트 : ");
		 for(int r : numbers) {
			 System.out.print(r + " ");
		 }
		
		
	}//main

}//class
