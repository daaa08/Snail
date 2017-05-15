package com.dajung.java.swirl;

public class Swirl {

	public static void main(String[] args) {

//		int array[][] = new int[3][3];
//		int count =0;
//
		Swirl s = new Swirl();  // drawSnail 함수를 불러오기위해. (만약 drawSnail의 함수에 static을 써주면 자동으로 불러오므로 쓸 필요가 없음)
		s.drawSnail(3);  // (3) 은 3*3배열을 만들겠다는 뜻
//
//		// 3*3 배열 값 넣기
//		for(int i=0; i<3; i++){
//			for (int j =0; j <3; j++){
//				count ++;
//				array[i][j] = count;
//			}
//		}
//		// 2차원 배열 출력
//		for(int i=0; i<3; i++){
//			for (int j =0; j <3; j++){
//				System.out.print("["+array[i][j] + "]");
//			}
//			System.out.println("");
//	    }
    }
	public void drawSnail(int count) {
		// 총 출력해야하는 숫자의 개수
		int total = count * count;  // 몇*몇의 배열인지 알려고
		int arr[][] = new int[count][count];

		int i = 0;
		int j = 0;

		int n = 0;
		while(n <= total){

				for( ; j < count; j++){
					arr[i][j] = ++n;
				}	--j;

				for( i = i+1; i < count; i++){
					arr[i][j] = ++n;
				}	--i;

				for (j =2; j>=0; j--){
					arr[i][j] = n++ ;
				}   j++;

				for (i=2 ; i>=1; i--){
					arr[i][j] = n++;
				}

//				i = i+1;
//				j = j+1;

		}
		for(i=0; i<3; i++){
		for (j =0; j <3; j++){
			System.out.print("["+arr[i][j] + "]");
		}
		System.out.println("");
    }
  }
}
