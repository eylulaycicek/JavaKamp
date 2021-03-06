package oopIntro;

public class Main {

	// CLASSLAR REFERANS TIPTIR
	// SOLID YAZILIM GELISTIRICI PRENSIPLERI
	// CLASSLAR IKIYE AYRILIR,?ZELLIK TUTUCU KLASLAR VE IS YAPICI CLASSLAR

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram"); // referans olusturma,intance

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";

		Product[] products = { product1, product2, product3 };
		System.out.println(products.length);

		for (Product product : products) {
			System.out.println(product.name);

		}

		category category1 = new category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		category category2 = new category();
		category2.id = 2;
		category2.name = "Ev/Bah?e";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
