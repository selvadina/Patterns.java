package pattern;

public class Task6LeftPascalStar {

	public static void main(String[] args) {
		int a=5;
		for(int i=0;i< a;i++) {
			for(int j=1;j<a-i;++j) {
			System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
			System.out.print("* ");
			}
			System.out.println(" ");
	}
		for(int i=1;i<=a;i++) {
			for(int j=0;j<i;++j) {
				System.out.print("  ");				
			}
			for(int j=a;j>i;j--) {
			System.out.print("* ");
			}
			System.out.println(" ");
	}
	
	

}
}