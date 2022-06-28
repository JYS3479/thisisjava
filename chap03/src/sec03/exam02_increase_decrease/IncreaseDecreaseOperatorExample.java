package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("--------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("--------------------------");
		z = x++;           // 대입먼저 후에 더하기 1
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------------");
		z = ++x + y++;   // 15 + 8 = 23 이지만 후에 y더하기1
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y); // 출력값 9 
		
	}

}
