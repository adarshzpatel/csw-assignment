class A1Q3{
    public static int reverseNumber(int n) {
		int result = 0;
		//Time complexity will be log10(n) -> as there will be log10(digits);
		while(n > 0) {
			int digit = n % 10;
			result = result*10 + digit;
			n = n/10;
		}
		return result;
	}

    public static void main(String[] args) {
		int n = 5892 ;
		System.out.println(reverseNumber(n));
	}
	
    
}