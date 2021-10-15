interface Parent {
	default void print() {
		System.out.println("Parent");
	}
}

public class Child implements Parent {
	public void print() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
	}
}

