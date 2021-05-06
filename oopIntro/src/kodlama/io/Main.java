package kodlama.io;

public class Main {

	// özellik nesnesi kurslar ,kategori,egitmen listeleri
	// is sinifi olarak düsündügüm classlar kursa kayit olma,kursun tamamlama
	// orani,yoklama

	public static void main(String[] args) {

		course course1 = new course();
		course1.id = 1;
		course1.name = "Programlamaya Giris için Temel Kurs";
		course1.unitPrice = 0;
		course1.instructor = "Engin Demirog";

		course course2 = new course();
		course2.id = 2;
		course2.name = "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)";
		course2.unitPrice = 0;
		course2.instructor = "Engin Demirog";

		course course3 = new course();
		course3.id = 3;
		course3.name = "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)";
		course3.unitPrice = 0;
		course3.instructor = "Engin Demirog";

		course[] courses = { course1, course2, course3 };
		System.out.println(courses.length);

		for (course course : courses) {
			System.out.println(course.name);
		}

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Tümü";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Programlama";

		Category[] categories = { category1, category2 };
		System.out.println(categories.length);

		for (Category category : categories) {
			System.out.println(category.name);

		}

		Register register = new Register();
		register.RegisterCourse(course1);
		register.RegisterCourse(course2);
		register.RegisterCourse(course3);

	}

}
