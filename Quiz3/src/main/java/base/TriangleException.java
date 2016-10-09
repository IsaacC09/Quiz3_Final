package base;
 
public class TriangleException extends Exception {
	private Triangle t;

	public TriangleException(Triangle t) {
		super();
		this.t = t;
	}

	public Triangle getT() {
		return t;
	}
	
	
}
 