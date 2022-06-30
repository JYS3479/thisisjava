package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));  //구구단 옆으로 출력 해보기
			}
		}

	}

}
