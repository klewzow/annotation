
public class Sum {
	private int a = 0;
	private int b = 0;

	public Sum(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@TestAnnotation(a = 7, b = 19)
	public int plus(int a, int b) {
		return a + b;
	}

	@TestAnnotation(a = 4, b = 4)
	public int multiply(int a, int b) {
		return a * b;
	}

	public Sum() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Sum [a=" + a + ", b=" + b + "]";
	}

}
