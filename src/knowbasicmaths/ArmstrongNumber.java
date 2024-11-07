package knowbasicmaths;

public class ArmstrongNumber {
	
	static boolean checkArmstrongNumber(int n) {
		int len = String.valueOf(n).length();
		int arms = 0 , dupn = n;
		while(dupn > 0 ) {
			arms += Math.pow(dupn % 10, len);
			dupn /= 10;
		}
		if(arms == n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkArmstrongNumber(1634));
	}

}
