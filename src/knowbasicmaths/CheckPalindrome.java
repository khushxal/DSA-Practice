package knowbasicmaths;

public class CheckPalindrome {
	
	static boolean checkPalindrome(int n) {
		int copy = n, revNum = 0 ;
		while(copy > 0) {
			revNum = revNum * 10 + (copy%10);
			copy /= 10;
		}
		if(revNum == n) {
			return true;
		}else {			
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome(10011));
	}
}
