package knowbasicmaths;

public class Prime {
	
	static boolean checkPrime1(int n){
		int factor_count = 0;
		for(int i = 1; i <= n ; i++ ) {
			if(n % i == 0) {
				factor_count = factor_count + 1 ;
			}
		}
		if(factor_count == 2) {
			return true;
		}
		return false;
	}
	
	static boolean checkPrime2(int n) {
		int factor_count = 0;
		System.out.println(Math.sqrt(n));
		for(int i = 1; i <= (int)Math.sqrt(n) ; i++ ) {
			if(n % i == 0) {
				factor_count++ ;
				System.out.println(factor_count);
				if(n/i != i) {
					factor_count++;
					System.out.println(factor_count);
				}
			}
		}
		if(factor_count == 2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
//		System.out.println(checkPrime1(17));
		System.out.println(checkPrime2(17));
	}

}
