package knowbasicmaths;

public class CountDigit {
	
	public static int countDigit1(int n) {
		int count  = 0;
		while(n > 0) {
			count++;
			n = n/10; 
		}
	return count;
	}
	
	public static int countDigit2(int n) {
		int count = 0;
		count = (int)Math.log10(n)+1;
		return count;
	}
	
	public static void main(String args[]) {
		System.out.println(countDigit1(1001));
		System.out.println(countDigit2(1001));
	}
}
