package oopIntro;

public class Product {

	public Product() { // constructor blok ,yapici blok
		System.out.println("Ben Çaliştim");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
