package knowbasicmaths;

public class AllDivisor {
	
	static void getAllDivisor(int n) {
		int divisor[] = new int[n];
		 int count = 0;
		for(int i = 1 ; i <= n; i++) {
			if(n % i == 0) {
				divisor[count++] = i;
				}
		}
		for(int i = 0; i < count - 1; i++) {
			System.out.print(divisor[i] + ", ");
		}
		System.out.print(divisor[count-1]);
	}
	
	public static void main(String[] args) {
		getAllDivisor(36);
	}
}
