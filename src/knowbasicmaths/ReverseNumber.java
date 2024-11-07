package knowbasicmaths;

public class ReverseNumber {
	
	static int reverseNumber(int n) {
		int revNum = 0 ;
		while(n > 0) {
			revNum = revNum * 10 + (n%10);
			n /= 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(201000));
	}

}
