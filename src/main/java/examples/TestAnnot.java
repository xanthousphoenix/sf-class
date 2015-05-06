package examples;

import java.lang.reflect.Field;

public class TestAnnot {

	public static void main(String[] args) {
		Thing t = new Thing();
		Class c = t.getClass(); // or Thing.class
		Field [] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("> " + f.getName());
			MyAnnot ma = f.getAnnotation(MyAnnot.class);
			if (ma != null) {
				System.out.println("Annotation found! We have " + ma.value() + " " + ma.fruit());
				try {
					f.setAccessible(true);
					f.set(t, "Hello");
				} catch (IllegalArgumentException | IllegalAccessException e) {
					System.out.println("That didn't work!");
				}
			}
		}
//		Field nameField = c.getDeclaredField("name");
		System.out.println("t.name is " + t.getName());
	}

}
