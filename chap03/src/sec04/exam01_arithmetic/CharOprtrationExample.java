package sec04.exam01_arithmetic;

public class CharOprtrationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;  //컴파일에러  결과값이 int라서 에러, char는 정수형타입
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: "+ c3);
	}

}
