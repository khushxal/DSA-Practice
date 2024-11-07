package knowbasicmaths;

public class GCD {
	
	static int findGCD1(int n1, int n2) {
		int GFD = 1 ;
		for (int i = 1; i <= Math.min(n1, n2) ; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                   GFD = i;
            }
        }
		return GFD;
	}
	
	static int findGCD2(int n1, int n2) {
		while(n1 > 0 && n2 > 0) {
			if(n1 > n2) {
				n1 = n1 % n2;
			}else {
				n2 = n2 % n1;
			}
		}
		if(n1 == 0)
			return n2;
		return n1 ;
	}
	

	public static void main(String[] args) {
		System.out.println(findGCD2(3, 20));
	}
}
