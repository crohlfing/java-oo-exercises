

public class Fraction {

	private int num;
	private int den;

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	private void simplify() {
		//int comp = this.num;
		//int compd = this.den;
		//int simn;
		//int simd = ;
		for (int i = this.num; i >= 1; --i) {
			if (this.num % i == 0) {
				if (this.den % i ==0) {
					int simn = this.num / i;
					int simd = this.den / i;
					System.out.println(simn + "/" + simd);
				}
			}

		}

	}

	private void mult(int num2, int den2) {
		int ansn = this.num * num2;
		int ansd = this.den * den2;
		System.out.println(ansn + "/" + ansd);
	}

	private void add(int num3, int den3) { 
		int ansd2 = this.den * den3;
		int ansn2 = (this.num * den3) + (num3 * this.den);
		System.out.println(ansn2 + "/" + ansd2);
	}

	private void recip() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
